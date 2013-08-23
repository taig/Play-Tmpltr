package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	html[A <: html[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "html", content, attributes )