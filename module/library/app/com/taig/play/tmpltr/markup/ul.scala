package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	ul[A <: ul[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "ul", attributes, content )