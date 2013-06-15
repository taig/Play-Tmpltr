package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	variable[A <: variable[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "var", attributes, content )