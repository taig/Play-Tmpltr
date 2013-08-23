package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	blockquote[A <: blockquote[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "blockquote", content, attributes )