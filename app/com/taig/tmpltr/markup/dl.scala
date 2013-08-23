package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	dl[A <: dl[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "dl", content, attributes )