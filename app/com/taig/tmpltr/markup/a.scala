package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	a[A <: a[A]] ( attributes: Attributes )( content: Content )
extends			Tag[A]( "a", content, attributes )