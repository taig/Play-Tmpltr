package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	details[A <: details[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "details", content, attributes )