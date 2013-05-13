package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	tfoot[A <: tfoot[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "tfoot", attributes, content )