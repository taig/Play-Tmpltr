package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

abstract class	link[A <: link[A]]( attributes: Attributes )
extends			Tag[A]( "link", attributes )