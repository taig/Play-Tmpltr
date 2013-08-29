package com.taig.tmpltr

import play.api.mvc.Content

/**
 * A representation of an HTML element that may be rendered into a serialized HTML entity.
 * 
 * @see [[com.taig.tmpltr.Tag.Empty]]
 * @see [[com.taig.tmpltr.Tag.Body]]
 */
trait Tag[+A <: Tag[A]]
{
	protected val self: A = this.asInstanceOf[A]

	/**
	 * Create a copy of this [[com.taig.tmpltr.Tag]] with additional [[com.taig.tmpltr.Attributes]].
	 *
	 * @param attributes The Attributes to append to currently available ones.
	 * @return A copy of this object with the additionally supplied Attributes.
	 */
	def %( attributes: Attributes ): A = this.asInstanceOf[A]

	/**
	 * Render the HTML representation of this [[com.taig.tmpltr.Tag]].
	 * 
	 * @return The rendered HTML representation of this Tag. May be an empty String.
	 */
	override def toString: String = ""
}

object Tag
{
	trait Appliable
	{
		protected lazy val `class` = Reflection.mirror.staticClass( getClass.getName.takeWhile( _ != '$' ) )
	}

	/**
	 * A bodiless HTML element, that may be rendered as closed explicitly or minimized and also has attributes available
	 * that will be added to the opening tag.
	 * 
	 * @tparam A The implementing class.
	 * @see [[com.taig.tmpltr.Tag.Body]]
	 * @see [[com.taig.tmpltr.Attributes]]
	 */
	trait Empty[+A <: Empty[A]] extends Tag[A]
	{
		val tag: String

		val attributes: Attributes

		val minimized: Boolean = true

		override def %( attributes: Attributes ): A =
		{
			self.construct( classOf[Attributes] )( this.attributes ~~ attributes )
		}

		override def toString = "<" + tag + attributes + ( if( minimized ) " />" else "></" + tag + ">" )
	}

	object Empty
	{
		trait Appliable[A <: Tag.Empty[A]] extends Tag.Appliable
		{
			def apply( attributes: Attributes ): A =
			{
				Reflection
					.newInstance[A]( `class` )( classOf[Attributes] )( attributes )
					.getOrElse( throw new RuntimeException( "No suitable constructor available" ) )
			}
		}
	}

	/**
	 * A full HTML-tag representation that complements the [[com.taig.tmpltr.Tag.Empty]] Tag to the effect that it may
	 * have content to be added between the opening and closing tags.
	 * 
	 * @tparam A The implementing class.
	 * @tparam C The type of the body's valid [[play.api.mvc.Content]].
	 */
	trait Body[+A <: Body[A, C], C <: Content] extends Empty[A]
	{
		val content: C

		override def %( attributes: Attributes ): A =
		{
			self.construct( classOf[Attributes], content.getClass )( this.attributes ~~ attributes, content )
		}

		override def toString =
		{
			"<" + tag + attributes + ( if( minimized && content.body.isEmpty ) " />" else ">" + content.body + "</" + tag + ">" )
		}
	}

	object Body
	{
		trait Appliable[A <: Tag.Body[A, C], C <: Content] extends Tag.Appliable
		{
			def apply( attributes: Attributes )( content: C ): A =
			{
				Reflection
					.newInstance[A]( `class` )( classOf[Attributes], content.getClass )( attributes, content )
					.getOrElse( throw new RuntimeException( "No suitable constructor available" ) )
			}

			def apply( content: C ): A = apply( Attributes.empty )( content )
		}
	}
}