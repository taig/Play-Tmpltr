package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	wbr[A <: wbr[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "wbr", content, attributes )