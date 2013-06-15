package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	ruby[A <: ruby[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "ruby", attributes, content )