package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	summary[A <: summary[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "summary", content, attributes )