package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	samp[A <: samp[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "samp", content, attributes )