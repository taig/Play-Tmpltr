package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Html

abstract class	aside[A <: aside[A]]( attributes: Attributes )( content: Html )
extends			Tag[A]( "aside", attributes, content )