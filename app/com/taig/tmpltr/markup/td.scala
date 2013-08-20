package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	td[A <: td[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "td", attributes, content )