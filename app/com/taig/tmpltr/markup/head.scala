package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	head[A <: head[A]]( attributes: Attributes )( content: Content )
extends 		Tag[A]( "head", content, attributes )