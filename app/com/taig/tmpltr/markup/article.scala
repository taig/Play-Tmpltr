package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	article[A <: article[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "article", attributes, content )