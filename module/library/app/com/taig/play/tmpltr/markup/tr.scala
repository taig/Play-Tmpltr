package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	tr[A <: tr[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "tr", attributes, content )