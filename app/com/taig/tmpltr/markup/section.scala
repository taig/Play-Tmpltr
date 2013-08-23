package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	section[A <: section[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "section", content, attributes )