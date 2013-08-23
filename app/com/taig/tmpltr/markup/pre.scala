package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	pre[A <: pre[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "pre", content, attributes )