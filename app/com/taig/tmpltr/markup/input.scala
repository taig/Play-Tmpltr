package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

abstract class	input[A <: input[A]]( attributes: Attributes )
extends			Tag[A]( "input", attributes )