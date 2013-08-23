package com.taig.tmpltr.markup

import com.taig.tmpltr._

import play.api.templates.Txt

abstract class	script[A <: script[A]]( attributes: Attributes )( content: Txt )
extends			Tag[A]( "script", content, attributes, false )