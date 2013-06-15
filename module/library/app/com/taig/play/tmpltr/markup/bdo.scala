package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	bdo[A <: bdo[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "bdo", attributes, content )