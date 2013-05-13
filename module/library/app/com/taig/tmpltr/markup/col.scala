package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

abstract class	col[A <: col[A]]( attributes: Attributes )
extends			Tag[A]( "col", attributes )