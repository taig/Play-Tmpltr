package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	thead[A <: thead[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "thead", attributes, content )