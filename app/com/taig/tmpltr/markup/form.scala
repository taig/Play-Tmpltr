package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	form[A <: form[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "form", content, attributes )