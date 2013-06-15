package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	nav[A <: nav[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "nav", attributes, content )