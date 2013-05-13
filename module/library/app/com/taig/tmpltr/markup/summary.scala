package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	summary[A <: summary[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "summary", attributes, content )