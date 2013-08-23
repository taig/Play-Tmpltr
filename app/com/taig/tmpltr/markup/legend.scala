package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	legend[A <: legend[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "legend", content, attributes )