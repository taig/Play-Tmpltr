//package com.taig.bootstrapper.bootstrap
//
//import play.api.templates.Html
//import scala.xml.Unparsed
//import com.taig.bootstrapper.{HtmlNode, Attributes}
//
//class Actions(content: Html, attributes: Attributes) extends HtmlNode[Actions](
//	<div class="form-actions">
//		<div class="pull-right">
//			{Unparsed( content.body )}
//		</div>
//	</div>, attributes
//)
//{
//	def %(attributes: Attributes) = new Actions( content, this.attributes ++ attributes )
//}