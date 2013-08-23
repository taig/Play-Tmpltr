package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	option[A <: option[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "option", content, attributes )