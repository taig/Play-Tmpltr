package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	hgroup[A <: hgroup[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "hgroup", attributes, content )