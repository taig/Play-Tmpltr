package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	cite[A <: cite[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "cite", content, attributes )