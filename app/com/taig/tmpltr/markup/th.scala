package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	th[A <: th[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "th", content, attributes )