package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Txt

abstract class	style[A <: style[A]]( attributes: Attributes )( content: Txt )
extends			Tag[A]( "style", attributes, content )