package com.taig.tmpltr

import play.api.mvc.Content

object Helper
{
	trait Element[H]
	{
		val content: Content
		
		protected val helper: H
	}

	trait Default[T <: Tag[T]] extends Element[DefaultCompanion[T]]
	{
		protected def copy = helper.apply( _: Attributes )( content )
	}

	trait DefaultCompanion[T <: Tag[T]]
	{
		def apply( attributes: Attributes )( content: Content ): T

		def apply( content: Content ): T = apply( Attributes.empty )( content )
	}

	trait Empty[T <: Tag[T]] extends Element[EmptyCompanion[T]]
	{
		protected def copy = helper.apply( _: Attributes )
	}

	trait EmptyCompanion[T <: Tag[T]]
	{
		def apply( attributes: Attributes ): T
	}
}