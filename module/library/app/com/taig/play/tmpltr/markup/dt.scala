package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	dt[A <: dt[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "dt", attributes, content )