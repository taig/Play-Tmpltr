package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	small[A <: small[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "small", attributes, content )