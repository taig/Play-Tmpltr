package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	button[A <: button[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "button", attributes, content )