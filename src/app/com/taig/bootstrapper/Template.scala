package com.taig.bootstrapper

import play.api.mvc.Call
import play.api.templates.Html
import views.helper.Input.TextArea

object Template
{
	private val a = Attributes.empty

	object Actions
	{
		def apply(attributes: Attributes = a)(content: Html): Actions = new Actions( content, attributes )
	}

	object Button
	{
		import views.helper.Icon.Color
		import views.helper.Button.{Size, Style}

		def apply(label: Option[String], url: Call, size: Size = Size.Default, style: Style = Style.Default, icon: Option[String] = None, attributes: Attributes = a): Button =
		{
			val color: Color = style match
			{
				case Style.Default | Style.Link => Color.Black
				case _ => Color.White
			}

			new Button( label, url, size, style, icon.map( new Icon( _, color, a ) ), attributes )
		}

		def apply(label: String, icon: String, url: Call, compact: Boolean, size: Size, style: Style, attributes: Attributes): Button =
		{
			val (l, t): (Option[String], Option[(String, String)]) = if( compact ) (None, Some( "title" -> label )) else (label, None)
			apply( l, url, size, style, Some( icon ), t.fold( attributes )( attributes + _ ) )
		}

		object Add
		{
			def apply(entity: String, url: Call, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = a): Button =
			{
				Button( entity + " hinzufügen", "plus-sign", url, compact, size, Style.Primary, attributes )
			}
		}

		object Cancel
		{
			def apply(url: Call, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = a): Button =
			{
				Button( "Abbrechen", "remove-sign", url, compact, size, Style.Inverse, attributes )
			}
		}

		object Delete
		{
			def apply(url: Call, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = a): Button =
			{
				Button( "Löschen", "trash", url, compact, size, Style.Danger, attributes )
			}
		}

		object Edit
		{
			def apply(url: Call, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = a): Button =
			{
				Button( "Bearbeiten", "edit", url, compact, size, Style.Primary, attributes )
			}
		}

		object Save
		{
			def apply(url: Call, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = a): Button =
			{
				Button( "Speichern", "ok-sign", url, compact, size, Style.Success, attributes )
			}
		}

		object Size
		{
			case object Mini extends Size( "mini" )
			case object Small extends Size( "small" )
			case object Default extends Size( None )
			case object Large extends Size( "normal" )
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
		import views.helper.Form.{Method, Style}

		def apply(action: Call, method: Method = Method.Get, attributes: Attributes = a)(content: Html)(implicit style: Style): Form =
		{
			new Form( action, method, style, content, attributes )
		}

		object Style
		{
			implicit val default = views.helper.Form.Style.Default

			implicit val horizontal = views.helper.Form.Style.Horizontal

			implicit val inline = views.helper.Form.Style.Inline

			implicit val search = views.helper.Form.Style.Search
		}

		object Element
		{
			import views.helper.Form.Message

			def apply(input: Input[_ <: Input[_]], label: Option[Label] = None, message: Option[Message] = None, attributes: Attributes = a)(implicit style: Style) =
			{
				// If a Label without a "for" attribute is provided, then define it automatically
				if( label.isDefined && label.get.attrs.get( "for" ).isEmpty )
				{
					val id: Option[String] = input.attrs.get( "id" ).orElse( input.attrs.get( "name" ).map( "_" + _ ) )

					style.build(
						id.fold[Input[_]]( input )( id => input % ("id" -> id) ),
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
			import views.helper.Form.Message

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
		import views.helper.Icon.Color

		def apply(image: String, color: Color, attributes: Attributes = a): Icon =
		{
			new Icon( image, color, attributes )
		}
	}

	object Input
	{
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