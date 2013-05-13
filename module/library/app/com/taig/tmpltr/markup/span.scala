package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	span[A <: span[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "span", attributes, content )