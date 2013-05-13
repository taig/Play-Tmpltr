package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	tbody[A <: tbody[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "tbody", attributes, content )