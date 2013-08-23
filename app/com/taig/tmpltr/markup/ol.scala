package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	ol[A <: ol[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "ol", content, attributes )