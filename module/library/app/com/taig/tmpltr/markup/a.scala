package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	a[A <: a[A]] ( attributes: Attributes )( content: Html )
extends			Tag[A]( "a", attributes, content )