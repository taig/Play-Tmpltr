package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	canvas[A <: canvas[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "canvas", attributes, content )