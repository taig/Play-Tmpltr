package com.taig.tmpltr.reflect

import Reflection.mirror

import scala.reflect.runtime.universe._

case class Class[C]( `class`: ClassSymbol ) extends Reflection
{
	def this( `class`: java.lang.Class[C] ) = this( mirror.classSymbol( `class` ) )

	def this( name: String ) = this( mirror.staticClass( name ) )

	def newInstanceOption( arguments: AnyRef* ): Option[C] =
	{
		findConstructor( arguments.map( _.getClass ): _* ).map( mirror
			.reflectClass( `class` )
			.reflectConstructor( _ )
			.apply( arguments: _* )
			.asInstanceOf[C] )
	}

	def newInstance( arguments: AnyRef* ): C = newInstanceOption( arguments: _* ).get

	def findConstructor( signature: java.lang.Class[_]* ): Option[MethodSymbol] =
	{
		val types = signature.map( mirror.classSymbol( _ ).toType )

		`class`
			.toType
			.members
			.collect{ case method: MethodSymbol if method.isConstructor => method -> getMethodSignature( method ) }
			.collectFirst{ case ( constructor, signature ) if matches( signature, types ) => constructor }
	}

	def getMethodSignature( method: MethodSymbol ): List[Type] = method.typeSignature match
	{
		case method: MethodType => getMethodTypes( method ).map( _.typeSignature )
		case _ => Nil
	}

	def getMethodTypes( method: MethodType ): List[Symbol] = method match
	{
		case MethodType( signature: List[Symbol], method: MethodType ) => signature ::: getMethodTypes( method )
		case MethodType( signature, _ ) => signature
		case _ => Nil
	}

	/**
	 * Check whether two type signatures are compatible.
	 *
	 * @param destination	The provided reference signature. 
	 * @param available		The signature that tries to fit into the reference signature's bounds.
	 * @return <code>true</code> if the available signature can be applied on the reference signature, otherwise
	 *         <code>false</code>.
	 */
	def matches( destination: Seq[Type], available: Seq[Type] ): Boolean =
	{
		if( destination.length == available.length )
		{
			for( i <- 0 to destination.length - 1 )
			{
				if( !( available( i ) <:< destination( i ) ) )
				{
					return false
				}
			}

			true
		}
		else
		{
			false
		}
	}
}

object Class
{
	def apply[C]( `class`: java.lang.Class[C] ): Class[C] = new Class( `class` )

	def apply[C]( name: String ): Class[C] = new Class[C]( name )
}