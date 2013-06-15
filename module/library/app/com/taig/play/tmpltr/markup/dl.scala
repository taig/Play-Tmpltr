package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	dl[A <: dl[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "dl", attributes, content )