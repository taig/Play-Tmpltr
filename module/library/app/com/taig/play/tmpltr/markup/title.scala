package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Txt

abstract class	title[A <: title[A]]( attributes: Attributes )( content: Txt )
extends			Tag[A]( "title", attributes, content )