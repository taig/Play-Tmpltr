package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	li[A <: li[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "li", attributes, content )