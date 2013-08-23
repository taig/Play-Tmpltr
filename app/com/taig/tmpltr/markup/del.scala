package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	del[A <: del[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "del", content, attributes )