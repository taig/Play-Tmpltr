package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	sub[A <: sub[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "sub", attributes, content )