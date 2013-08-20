package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	rp[A <: rp[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "rp", attributes, content )