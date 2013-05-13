package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	form[A <: form[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "form", attributes, content )