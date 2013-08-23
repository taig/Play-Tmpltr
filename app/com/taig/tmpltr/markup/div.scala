package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	div[A <: div[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "div", content, attributes )