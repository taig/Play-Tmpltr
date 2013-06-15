package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	strong[A <: strong[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "strong", attributes, content )