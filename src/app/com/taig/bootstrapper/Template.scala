package com.taig.bootstrapper

import play.api.mvc.Call
import play.api.templates.Html
import play.api.i18n.Messages

object Template
{
	implicit def callToString(call: Call): String = call.toString

	implicit def stringToOption( string: String ): Option[String] = Some( string )

	private val a = Attributes.empty

	object Actions
	{
		def apply(attributes: Attributes = a)(content: Html): Actions = new Actions( content, attributes )
	}

	object Button
	{
		import com.taig.bootstrapper.Icon.Color
		import com.taig.bootstrapper.Button.{Size, Style}

		def apply(label: Option[String], url: String, size: Size = Size.Default, style: Style = Style.Default, icon: Option[String] = None, attributes: Attributes = a): Button =
		{
			val color: Color = style match
			{
				case Style.Default | Style.Link => Color.Black
				case _ => Color.White
			}

			new Button( label, url, size, style, icon.map( new Icon( _, color, a ) ), attributes )
		}

		def apply(label: String, icon: String, url: String, compact: Boolean, size: Size, style: Style, attributes: Attributes): Button =
		{
			val (l, t): (Option[String], Option[(String, String)]) = if( compact ) (None, Some( "title" -> label )) else (label, None)
			apply( l, url, size, style, Some( icon ), t.fold( attributes )( attributes + _ ) )
		}

		object Add
		{
			def apply(entity: String, url: String, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = a): Button =
			{
				Button( Messages("bootstrapper.button.label.add", entity), "plus-sign", url, compact, size, Style.Primary, attributes )
			}
		}

		object Cancel
		{
			def apply(url: String, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = a): Button =
			{
				Button( Messages("bootstrapper.button.label.cancel"), "remove-sign", url, compact, size, Style.Inverse, attributes )
			}
		}

		object Delete
		{
			def apply(url: String, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = a): Button =
			{
				Button( Messages("bootstrapper.button.label.delete"), "trash", url, compact, size, Style.Danger, attributes )
			}
		}

		object Edit
		{
			def apply(url: String, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = a): Button =
			{
				Button( Messages("bootstrapper.button.label.edit"), "edit", url, compact, size, Style.Primary, attributes )
			}
		}

		object Save
		{
			def apply(url: String, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = a): Button =
			{
				Button( Messages("bootstrapper.button.label.save"), "ok-sign", url, compact, size, Style.Success, attributes )
			}
		}

		object Size
		{
			case object Mini extends Size( "mini" )
			case object Small extends Size( "small" )
			case object Default extends Size( None )
			case object Large extends Size( "large" )
		}

		object Style
		{
			case object Default extends Style( None )
			case object Primary extends Style( "primary" )
			case object Info extends Style( "info" )
			case object Success extends Style( "success" )
			case object Warning extends Style( "warning" )
			case object Danger extends Style( "danger" )
			case object Inverse extends Style( "inverse" )
			case object Link extends Style( "link" )
		}
	}

	object Form
	{
		import com.taig.bootstrapper.Form.{Method, Style}

		def apply(action: String, method: Method = Method.Get, attributes: Attributes = a)(content: Html)(implicit style: Style): Form =
		{
			new Form( action, method, style, content, attributes )
		}

		object Style
		{
			implicit val default = com.taig.bootstrapper.Form.Style.Default
			implicit val horizontal = com.taig.bootstrapper.Form.Style.Horizontal
			implicit val inline = com.taig.bootstrapper.Form.Style.Inline
			implicit val search = com.taig.bootstrapper.Form.Style.Search
		}

		object Element
		{
			import com.taig.bootstrapper.Form.Message

			def apply(input: Input[_ <: Input[_]], label: Option[Label] = None, message: Option[Message] = None, attributes: Attributes = a)(implicit style: Style) =
			{
				// If a Label without a "for" attribute is provided, then define it automatically
				if( label.isDefined && label.get.attrs.get( "for" ).isEmpty )
				{
					val id: Option[String] = input.attrs.get( "id" ).orElse( input.attrs.get( "name" ).map( "_" + _ ) )

					style.build(
						id.fold[Input[_]]( input )( id => input % ( "id" -> id ) ),
						id.fold( label )( id => label.map( _ % ( "for" -> id ) ) ),
						message,
						attributes
					)
				}
				else
				{
					style.build( input, label, message, attributes )
				}
			}
		}

		object Message
		{
			import com.taig.bootstrapper.Form.Message

			class Default(text: String, attributes: Attributes) extends Message( None, text, attributes )

			object Default
			{
				def apply(text: String, attributes: Attributes = a) = new Default( text, attributes )
			}

			class Error(text: String, attributes: Attributes) extends Message( "error", text, attributes )

			object Error
			{
				def apply(text: String, attributes: Attributes = a) = new Error( text, attributes )
			}
		}
	}

	object Icon
	{
		import com.taig.bootstrapper.Icon.Color

		def apply(image: String, color: Color, attributes: Attributes = a): Icon =
		{
			new Icon( image, color, attributes )
		}
	}

	object Input
	{
		import com.taig.bootstrapper.Input.TextArea

		object TextArea
		{
			def apply(name: Option[String] = None, attributes: Attributes = a): TextArea = new TextArea(
				name, attributes
			)
		}
	}

	object Label
	{
		def apply(text: String, `for`: Option[String] = None, attributes: Attributes = a): Label = new Label(
			text, `for`, attributes
		)
	}
}