package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	cite[A <: cite[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "cite", attributes, content )