package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	section[A <: section[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "section", attributes, content )