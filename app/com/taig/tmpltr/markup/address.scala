package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	address[A <: address[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "address", attributes, content )