package com.taig.tmpltr.engine

import play.api.mvc.Content
import com.taig.tmpltr.markup

package object html
{
	implicit def bodyFromContent( content: Content ): markup.body = body( content )

	implicit def headFromContent( content: Content ): markup.head = head( content )
}