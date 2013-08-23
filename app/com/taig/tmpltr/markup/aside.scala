package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.mvc.Content

abstract class	aside[A <: aside[A]]( attributes: Attributes )( content: Content )
extends			Tag[A]( "aside", content, attributes )