package com.taig.tmpltr.engine.bootstrap

import com.taig.tmpltr._
import com.taig.tmpltr.engine.html

import play.api.mvc.Content

class	page_header( attributes: Attributes )( content: Content )
extends	html.div( attributes ~ ( "class" -> "page-header" ) )( content )
with	Tag.Body[page_header, Content]

object	page_header
extends	Tag.Body.Appliable[page_header, Content]