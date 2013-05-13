package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	audio[A <: audio[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "audio", attributes, content )