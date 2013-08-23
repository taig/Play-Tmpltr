package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	video[A <: video[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "video", content, attributes )