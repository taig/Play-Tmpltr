package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	del[A <: del[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "del", attributes, content )