package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	optgroup[A <: optgroup[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "optgroup", attributes, content )