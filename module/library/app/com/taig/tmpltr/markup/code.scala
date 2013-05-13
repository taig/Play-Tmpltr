package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	code[A <: code[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "code", attributes, content )