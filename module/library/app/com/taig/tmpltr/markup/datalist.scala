package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	datalist[A <: datalist[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "datalist", attributes, content )