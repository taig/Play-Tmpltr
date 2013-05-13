package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	ol[A <: ol[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "ol", attributes, content )