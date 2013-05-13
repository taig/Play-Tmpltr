package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	iframe[A <: iframe[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "iframe", attributes, content )