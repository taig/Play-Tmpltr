package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	noscript[A <: noscript[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "noscript", attributes, content )