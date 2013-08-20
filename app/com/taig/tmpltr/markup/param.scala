package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

abstract class	param[A <: param[A]]( attributes: Attributes )
extends			Tag[A]( "param", attributes )