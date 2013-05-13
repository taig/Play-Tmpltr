package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	dfn[A <: dfn[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "dfn", attributes, content )