package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

abstract class	img[A <: img[A]]( attributes: Attributes )
extends			Tag[A]( "img", attributes )