package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

abstract class	meta[A <: meta[A]]( attributes: Attributes )
extends			Tag[A]( "meta", attributes )