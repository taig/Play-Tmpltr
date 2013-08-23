package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	footer[A <: footer[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "footer", content, attributes )