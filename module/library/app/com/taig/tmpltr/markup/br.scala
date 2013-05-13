package com.taig.tmpltr.markup

import com.taig.tmpltr.{ Attributes, Tag }

abstract class	br[A <: br[A]]( attributes: Attributes )
extends			Tag[A]( "br", attributes )