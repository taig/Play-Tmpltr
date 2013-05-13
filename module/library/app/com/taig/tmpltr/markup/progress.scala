package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	progress[A <: progress[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "progress", attributes, content )