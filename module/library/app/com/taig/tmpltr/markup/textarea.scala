package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

import play.api.templates.Txt

abstract class	textarea[A <: textarea[A]]( attributes: Attributes )( content: Txt )
extends			Tag[A]( "textarea", attributes, content )