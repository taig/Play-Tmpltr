package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	html[A <: html[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "html", attributes, content )