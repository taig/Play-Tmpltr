package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	sup[A <: sup[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "sup", content, attributes )