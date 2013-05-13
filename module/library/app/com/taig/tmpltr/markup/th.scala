package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	th[A <: th[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "th", attributes, content )