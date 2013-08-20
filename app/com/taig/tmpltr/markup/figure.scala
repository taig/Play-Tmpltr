package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	figure[A <: figure[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "figure", attributes, content )