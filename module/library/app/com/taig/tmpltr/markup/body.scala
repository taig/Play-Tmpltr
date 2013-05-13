package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	body[A <: body[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "body", attributes, content )