package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	dialog[A <: dialog[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "dialog", content, attributes )