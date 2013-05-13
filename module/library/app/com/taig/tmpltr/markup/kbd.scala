package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	kbd[A <: kbd[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "kbd", attributes, content )