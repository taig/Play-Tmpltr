package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	address[A <: address[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "address", content, attributes )