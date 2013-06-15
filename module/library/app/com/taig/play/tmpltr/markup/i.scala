package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	i[A <: i[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "i", attributes, content )