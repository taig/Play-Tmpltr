package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

abstract class	area[A <: area[A]]( attributes: Attributes )
extends			Tag[A]( "area", attributes )