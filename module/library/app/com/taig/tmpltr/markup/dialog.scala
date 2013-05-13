package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	dialog[A <: dialog[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "dialog", attributes, content )