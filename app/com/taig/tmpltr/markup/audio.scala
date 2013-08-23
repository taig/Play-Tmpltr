package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	audio[A <: audio[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "audio", content, attributes )