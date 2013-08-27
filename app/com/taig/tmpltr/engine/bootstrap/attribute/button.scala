package com.taig.tmpltr.engine.bootstrap.attribute

import com.taig.tmpltr.engine.bootstrap.button._

trait button
{
	val disabled: Boolean

	val style: style

	val size: Option[size]
}