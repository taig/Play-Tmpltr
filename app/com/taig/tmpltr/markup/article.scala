package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	article[A <: article[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "article", content, attributes )