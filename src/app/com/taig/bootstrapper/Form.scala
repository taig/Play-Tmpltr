package com.taig.bootstrapper

import play.api.templates.Html
import scala.xml.{Elem, NodeSeq, Unparsed}

class Form(action: String, method: Form.Method, style: Form.Style, content: Html, attributes: Attributes) extends HtmlNode[Form](
	<form action={action} method={method} class={style}>
		{Unparsed( content.body )}
	</form>, attributes
)
{
	def %(attributes: Attributes): Form = new Form( action, method, style, content, this.attributes ++ attributes )
}

object Form
{
	class Method(identifier: String) extends Property( None, identifier )

	abstract sealed class Style(identifier: Option[String]) extends Property( "form", identifier )
	{
		def build(input: Input[_], label: Option[Label], message: Option[Message], attributes: Attributes): NodeSeq
	}
	object Style
	{
		object Default extends Style( None )
		{
			def build(input: Input[_], label: Option[Label], message: Option[Message], attributes: Attributes) = Seq(
				label.getOrElse( null ), input
			)
		}

		object Horizontal extends Style( "horizontal" )
		{
			def build(input: Input[_], label: Option[Label], message: Option[Message], attributes: Attributes): HtmlNode[HtmlNode[_]] = new HtmlNode[HtmlNode[_]](
				<div class={"control-group " + message.fold( "" )( _.`type`.getOrElse( "" ) )}>
					{label.orNull}{input}{message.orNull}
				</div>, attributes
			)
			{
				def %(attr: Attributes) = build( input, label, message, attrs ++ attr )
			}
		}

		object Inline extends Style( "inline" )
		{
			def build(input: Input[_], label: Option[Label], message: Option[Message], attributes: Attributes) = input
		}

		object Search extends Style( "search" )
		{
			def build(input: Input[_], label: Option[Label], message: Option[Message], attributes: Attributes) = input
		}
	}

	class Message(val `type`: Option[String], message: String, attributes: Attributes) extends HtmlNode[Message](
		<span class="help-block">
			{message}
		</span>, attributes
	)
	{
		def %(attributes: Attributes) = new Message( `type`, message, this.attributes ++ attributes )
	}

	abstract class Element[E <: Element[E]](element: Elem, name: Option[String], attributes: Attributes) extends HtmlNode[E](
		element, name.fold( attributes )( name => attributes + ( "name" -> name ) )
	)
	object Element
	{
		class Input(`type`: Input.Type, name: Option[String], attributes: Attributes) extends Element[Input](
				<input type={`type`}/>, name, attributes
		)
		{
			def %(attributes: Attributes) = new Input( `type`, name, this.attributes ++ attributes )
		}
		object Input
		{
			class Type(identifier: String) extends Property( None, identifier )
		}

		class TextArea(name: Option[String], attributes: Attributes) extends Element[TextArea](
			<textarea></textarea>,
			name,
			attributes
		)
		{
			def %(attributes: Attributes) = new TextArea( name, this.attributes ++ attributes )
		}
	}
}