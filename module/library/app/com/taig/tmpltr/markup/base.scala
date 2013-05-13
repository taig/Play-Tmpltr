package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

abstract class	base[A <: base[A]]( attributes: Attributes )
extends			Tag[A]( "base", attributes )