package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	keygen[A <: keygen[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "keygen", attributes, content )