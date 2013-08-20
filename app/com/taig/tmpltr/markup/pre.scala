package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	pre[A <: pre[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "pre", attributes, content )