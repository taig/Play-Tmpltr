package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	option[A <: option[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "option", attributes, content )