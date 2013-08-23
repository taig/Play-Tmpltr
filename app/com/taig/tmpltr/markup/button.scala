package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	button[A <: button[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "button", content, attributes )