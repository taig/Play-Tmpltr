package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	ul[A <: ul[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "ul", content, attributes )