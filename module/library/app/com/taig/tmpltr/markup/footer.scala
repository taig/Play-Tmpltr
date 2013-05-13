package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	footer[A <: footer[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "footer", attributes, content )