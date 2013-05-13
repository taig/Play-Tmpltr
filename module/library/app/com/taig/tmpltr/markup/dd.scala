package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	dd[A <: dd[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "dd", attributes, content )