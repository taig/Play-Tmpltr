package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	select[A <: select[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "select", content, attributes )