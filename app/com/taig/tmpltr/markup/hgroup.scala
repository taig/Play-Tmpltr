package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	hgroup[A <: hgroup[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "hgroup", content, attributes )