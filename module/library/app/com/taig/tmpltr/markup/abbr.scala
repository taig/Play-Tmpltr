package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	abbr[A <: abbr[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "abbr", attributes, content )