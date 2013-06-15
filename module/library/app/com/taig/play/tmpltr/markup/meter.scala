package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	meter[A <: meter[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "meter", attributes, content )