package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	blockquote[A <: blockquote[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "blockquote", attributes, content )