package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

abstract class	hr[A <: hr[A]]( attributes: Attributes )
extends			Tag[A]( "hr", attributes )