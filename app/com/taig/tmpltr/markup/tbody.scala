package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	tbody[A <: tbody[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "tbody", content, attributes )