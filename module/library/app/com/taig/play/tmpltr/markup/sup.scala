package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	sup[A <: sup[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "sup", attributes, content )