package com.taig

import play.api.templates.{ Html, Txt }
import play.api.mvc.{ Call, Content }

package object tmpltr
{
	implicit def attributesFromMap( map: Map[String, Set[String]] ) = new Attributes( map )

	implicit def attributesFromTuple( tuple: (String, _) ) = attributesFromTuples( tuple )

	implicit def attributesFrom2Tuples( tuples: ((String, _), (String, _)) ) = attributesFromTuples( tuples._1, tuples._2 )

	implicit def attributesFrom3Tuples( tuples: ((String, _), (String, _), (String, _)) ) = attributesFromTuples( tuples._1, tuples._2, tuples._3 )

	implicit def attributesFrom4Tuples( tuples: ((String, _), (String, _), (String, _), (String, _)) ) = attributesFromTuples( tuples._1, tuples._2, tuples._3, tuples._4 )

	implicit def attributesFrom5Tuples( tuples: ((String, _), (String, _), (String, _), (String, _), (String, _)) ) = attributesFromTuples( tuples._1, tuples._2, tuples._3, tuples._4, tuples._5 )

	implicit def attributesFrom6Tuples( tuples: ((String, _), (String, _), (String, _), (String, _), (String, _), (String, _)) ) = attributesFromTuples( tuples._1, tuples._2, tuples._3, tuples._4, tuples._5, tuples._6 )

	implicit def attributesFrom7Tuples( tuples: ((String, _), (String, _), (String, _), (String, _), (String, _), (String, _), (String, _)) ) = attributesFromTuples( tuples._1, tuples._2, tuples._3, tuples._4, tuples._5, tuples._6, tuples._7 )

	implicit def attributesFrom8Tuples( tuples: ((String, _), (String, _), (String, _), (String, _), (String, _), (String, _), (String, _), (String, _)) ) = attributesFromTuples( tuples._1, tuples._2, tuples._3, tuples._4, tuples._5, tuples._6, tuples._7, tuples._8 )

	implicit def attributesFrom9Tuples( tuples: ((String, _), (String, _), (String, _), (String, _), (String, _), (String, _), (String, _), (String, _), (String, _)) ) = attributesFromTuples( tuples._1, tuples._2, tuples._3, tuples._4, tuples._5, tuples._6, tuples._7, tuples._8, tuples._9 )

	implicit def attributesFrom10Tuples( tuples: ((String, _), (String, _), (String, _), (String, _), (String, _), (String, _), (String, _), (String, _), (String, _), (String, _)) ) = attributesFromTuples( tuples._1, tuples._2, tuples._3, tuples._4, tuples._5, tuples._6, tuples._7, tuples._8, tuples._9, tuples._10 )

	private def attributesFromTuples( tuples: (String, _)* ) = attributesFromMap( Map( tuples: _* ).mapValues( setFromAny ) )

	implicit def htmlFromOptionTag( tag: Option[Tag[_]] ) = tag.map( htmlFromTag ).getOrElse( Html.empty )

	implicit def htmlFromTag( tag: Tag[_] ) = Html( tag.toString )
	
	implicit def htmlFromContent( content: Content ) = content match
	{
		case html: Html => html
		case _ => Html( content.body )
	}

	implicit def optionFromProperty[P <: Property]( property: P ) = Option( property )

	implicit def optionFromString( string: String ): Option[String] = Some( string )

	implicit def optionStringFromCall( call: Call ): Option[String] = Some( call.toString )

	implicit def setFromAny( any: Any ): Set[String] = any match
	{
		case string: String => string.split( " " ).toSet
		case Some( value ) => setFromAny( value )
		case property: Property => setFromAny( property.toString )
		case product: Product => product.productIterator.toSet.map( ( a: Any ) => setFromAny( a ) ).flatten // TODO optimize
		case set: Set[_] => set.map( setFromAny ).flatten
		case _ => Set.empty
	}

	implicit def txtFromContent( content: Content ) = content match
	{
		case txt: Txt => txt
		case _ => txtFromString( content.body )
	}

	implicit def txtFromString( string: String ) = Txt( string )

	implicit class Reflector[A]( val element: A )
	{
		def construct( classes: Class[_]* )( arguments: Any* ): A =
		{
			Reflection
				.newInstance[A]( Reflection.mirror.classSymbol( getClass ) )( classes: _* )( arguments: _* )
				.getOrElse( throw new RuntimeException( "No suitable constructor available" ) )
		}
	}
}