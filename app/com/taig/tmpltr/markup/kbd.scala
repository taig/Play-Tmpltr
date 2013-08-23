package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	kbd[A <: kbd[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "kbd", content, attributes )