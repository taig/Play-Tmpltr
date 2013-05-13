package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Txt

abstract class	script[A <: script[A]]( attributes: Attributes )( content: Txt )
extends			Tag[A]( "script", attributes, content, false )