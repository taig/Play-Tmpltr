package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	mark[A <: mark[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "mark", attributes, content )