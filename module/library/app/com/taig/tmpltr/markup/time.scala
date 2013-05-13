package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	time[A <: time[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "time", attributes, content )