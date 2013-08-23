package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	sub[A <: sub[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "sub", content, attributes )