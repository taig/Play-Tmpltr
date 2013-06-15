package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	head[A <: head[A]]( attributes: Attributes )( content: Html )
extends 		Tag[A]( "head", attributes, content )