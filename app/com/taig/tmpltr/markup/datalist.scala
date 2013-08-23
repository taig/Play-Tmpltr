package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	datalist[A <: datalist[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "datalist", content, attributes )