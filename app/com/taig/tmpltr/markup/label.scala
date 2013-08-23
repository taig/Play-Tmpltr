package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	label[A <: label[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "label", content, attributes )