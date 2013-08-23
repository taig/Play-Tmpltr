package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	li[A <: li[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "li", content, attributes )