package com.taig.tmpltr

import scala.reflect.runtime.universe._

object Reflection
{
	lazy val mirror = runtimeMirror( getClass.getClassLoader )

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

	def findConstructor( `class`: ClassSymbol )( classes: Class[_]* ): Option[MethodSymbol] =
	{
		val types = classes.map( getType )

		`class`
			.toType
			.members
			.collect{ case method: MethodSymbol if method.isConstructor => method -> getMethodSignature( method ) }
			.collectFirst{ case ( constructor, signature ) if matches( signature, types ) => constructor }
	}

	def newInstance[A]( `class`: ClassSymbol )( classes: Class[_]* )( arguments: Any* ): Option[A] =
	{
		findConstructor( `class` )( classes: _* ).map( mirror
			.reflectClass( `class` )
			.reflectConstructor( _ )
			.apply( arguments: _* )
			.asInstanceOf[A] )
	}

	/**
	 * Check whether two Type signatures are compatible.
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

	def getType( `class`: Class[_] ): Type = mirror.classSymbol( `class` ).toType
}