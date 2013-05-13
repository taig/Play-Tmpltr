package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	caption[A <: caption[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "caption", attributes, content )