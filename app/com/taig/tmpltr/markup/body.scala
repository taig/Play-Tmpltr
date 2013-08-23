package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	body[A <: body[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "body", content, attributes )