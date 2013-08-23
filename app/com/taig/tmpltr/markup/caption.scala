package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	caption[A <: caption[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "caption", content, attributes )