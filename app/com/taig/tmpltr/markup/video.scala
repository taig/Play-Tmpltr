package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	video[A <: video[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "video", attributes, content )