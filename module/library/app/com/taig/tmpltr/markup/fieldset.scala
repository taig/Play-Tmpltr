package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	fieldset[A <: fieldset[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "fieldset", attributes, content )