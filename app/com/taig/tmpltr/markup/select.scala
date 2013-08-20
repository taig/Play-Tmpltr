package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	select[A <: select[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "select", attributes, content )