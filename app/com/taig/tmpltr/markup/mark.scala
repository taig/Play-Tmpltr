package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	mark[A <: mark[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "mark", content, attributes )