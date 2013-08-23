package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	iframe[A <: iframe[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "iframe", content, attributes )