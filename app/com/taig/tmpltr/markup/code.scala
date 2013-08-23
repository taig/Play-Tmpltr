package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	code[A <: code[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "code", content, attributes )