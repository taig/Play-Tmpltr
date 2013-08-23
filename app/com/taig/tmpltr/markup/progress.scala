package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	progress[A <: progress[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "progress", content, attributes )