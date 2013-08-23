package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	time[A <: time[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "time", content, attributes )