package com.taig.bootstrapper

import play.api.mvc.Call
import play.api.templates.Html
import play.api.i18n.Messages
import com.taig.bootstrapper.Button.Style

object Template
{
	implicit def callToString(call: Call): String = call.toString

	implicit def stringToOption(string: String): Option[String] = Some( string )

	/**
	 * @see [[http://twitter.github.io/bootstrap/base-css.html#forms]] (section "From actions")
	 * @see [[com.taig.bootstrapper.Actions]]
	 */
	object Action
	{
		/**
		 * Render a Form Action wrapper containing a given Html input.
		 *
		 * @param attributes Additional attributes that will be added to the HTML tag (default: [[Attributes.empty]]).
		 * @param content The [[play.api.templates.Html]] content that will be placed within the form action.
		 * @return The HTML representation of the Action.
		 */
		def apply(attributes: Attributes = Attributes.empty)(content: Html): Actions =
		{
			new Actions( content, attributes )
		}
	}

	/**
	 * @see [[http://twitter.github.io/bootstrap/base-css.html#buttons]]
	 * @see [[com.taig.bootstrapper.Button]]
	 */
	object Button
	{
		import com.taig.bootstrapper.Button.{Size, Style}
		import com.taig.bootstrapper.Icon.Color
		import com.taig.bootstrapper.Template.Icon.Color._

		/**
		 * Render a Button (based on HTML <code>a</code>-tag).
		 *
		 * @param label The text that will be displayed on the Button or [[scala.None]] to omit. Use [[stringToOption]]
		 *              for implicit String conversion.
		 * @param url The Button's <code>href</code> attribute value. Use [[callToString]] for implicit
		 *            [[play.api.mvc.Call]] conversion.
		 * @param size The Button's size. Either [[Size.Mini]], [[Size.Small]], [[Size.Default]] or [[Size.Large]]
		 *             (default: [[Size.Default]]).
		 * @param style The Button's style. Either [[Style.Default]], [[Style.Primary]], [[Style.Info]],
		 *              [[Style.Success]], [[Style.Warning]], [[Style.Danger]], [[Style.Inverse]] or [[Style.Link]]
		 *              (default: [[Style.Default]]).
		 * @param icon The icon that will be displayed to the left of the label (if any). Use [[scala.None]] to omit.
		 *             Use [[stringToOption]] for implicit String conversion. (default:[[scala.None]]; See
		 *             [[http://twitter.github.io/bootstrap/base-css.html#icons]] to check available icons).
		 * @param attributes Additional attributes that will be added to the HTML tag (default: [[Attributes.empty]]).
		 * @return The HTML representation of the Button.
		 */
		def apply(label: Option[String], url: String, size: Size = Size.Default, style: Style = Style.Default, icon: Option[String] = None, attributes: Attributes = Attributes.empty): Button =
		{
			val color: Color = style match
			{
				case Style.Default | Style.Link => Black
				case _ => White
			}

			new Button( label, url, size, style, icon.map( new Icon( _, color, Attributes.empty ) ), attributes )
		}

		/**
		 * Render a Button (based on HTML <code>a</code>-tag) that must provide an icon but in return supports a compact
		 * mode.
		 *
		 * @param label The text that will be displayed on the Button or [[scala.None]] to omit. Use [[stringToOption]]
		 *              for implicit String conversion.
		 * @param icon The icon that will be displayed to the left of the label (if visible). (See
		 *             [[http://twitter.github.io/bootstrap/base-css.html#icons]] to check available icons).
		 * @param url The Button's <code>href</code> attribute value. Use [[callToString]] for implicit
		 *            [[play.api.mvc.Call]] conversion.
		 * @param compact If set to <code>true</code> the label will not be shown; instead it will be moved to the
		 *                Button's <code>title</code> tag (default: <code>false</code>).
		 * @param size The Button's size. Either [[Size.Mini]], [[Size.Small]], [[Size.Default]] or [[Size.Large]].
		 * @param style The Button's style. Either [[Style.Default]], [[Style.Primary]], [[Style.Info]],
		 *              [[Style.Success]], [[Style.Warning]], [[Style.Danger]], [[Style.Inverse]] or [[Style.Link]].
		 * @param attributes Additional attributes that will be added to the HTML tag.
		 * @return The HTML representation of the Button.
		 */
		def apply(label: String, icon: String, url: String, compact: Boolean, size: Size, style: Style, attributes: Attributes): Button =
		{
			val (l, t): (Option[String], Option[(String, String)]) = if( compact ) (None, Some( "title" -> label )) else (label, None)
			apply( l, url, size, style, Some( icon ), t.fold( attributes )( attributes + _ ) )
		}

		object Add
		{
			def apply(entity: String, url: String, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = Attributes.empty): Button =
			{
				Button(
					Messages( "bootstrapper.button.label.add", entity ),
					"plus-sign",
					url,
					compact,
					size,
					Style.Primary,
					attributes
				)
			}
		}

		object Cancel
		{
			def apply(url: String, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = Attributes.empty): Button =
			{
				Button(
					Messages( "bootstrapper.button.label.cancel" ),
					"remove-sign",
					url,
					compact,
					size,
					Style.Inverse,
					attributes
				)
			}
		}

		object Delete
		{
			def apply(url: String, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = Attributes.empty): Button =
			{
				Button(
					Messages( "bootstrapper.button.label.delete" ),
					"trash",
					url,
					compact,
					size,
					Style.Danger,
					attributes
				)
			}
		}

		object Edit
		{
			def apply(url: String, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = Attributes.empty): Button =
			{
				Button(
					Messages( "bootstrapper.button.label.edit" ), "edit", url, compact, size, Style.Primary, attributes
				)
			}
		}

		object Save
		{
			def apply(url: String, compact: Boolean = false, size: Size = Size.Default, attributes: Attributes = Attributes.empty): Button =
			{
				Button(
					Messages( "bootstrapper.button.label.save" ),
					"ok-sign",
					url,
					compact,
					size,
					Style.Success,
					attributes
				)
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

	/**
	 * @see [[http://twitter.github.io/bootstrap/base-css.html#buttons]]
	 * @see [[com.taig.bootstrapper.Form]]
	 */
	object Form
	{
		import com.taig.bootstrapper.Form.{Method, Style}

		/**
		 * Render a Form wrapper containing a given [[play.api.templates.Html]] input.
		 *
		 * @param action The Form tag's <code>action</code> attribute value.
		 * @param method The Form tag's <code>method</code> attribute value. Either [[Method.Get]] or [[Method.Post]]
		 *               (default: [[Method.Get]]).
		 * @param attributes Additional attributes that will be added to the HTML tag.
		 * @param content The [[play.api.templates.Html]] content that will be placed within the form.
		 * @param style The Form's style. Either [[Style.default]], [[Style.horizontal]], [[Style.inline]] or
		 *              [[Style.Search]]. Make sure to import your desired style into your view to pass this parameter
		 *              implicit.
		 * @return The HTML representation of the Form.
		 */
		def apply(action: String, method: Method = Method.Get, attributes: Attributes = Attributes.empty)(content: Html)(implicit style: Style): Form =
		{
			new Form( action, method, style, content, attributes )
		}

		object Method
		{
			case object Get extends Method( "GET" )
			case object Post extends Method( "POST" )
		}

		object Style
		{
			implicit val default = com.taig.bootstrapper.Form.Style.Default
			implicit val horizontal = com.taig.bootstrapper.Form.Style.Horizontal
			implicit val inline = com.taig.bootstrapper.Form.Style.Inline
			implicit val search = com.taig.bootstrapper.Form.Style.Search
		}

		//		object Element
		//		{
		//			import com.taig.bootstrapper.Form.Message
		//
		//			def apply(input: Input[_ <: Input[_]], label: Option[Label] = None, message: Option[Message] = None, attributes: Attributes = Attributes.empty)(implicit style: Style) =
		//			{
		//				// If a Label without a "for" attribute is provided, then define it automatically
		//				if( label.isDefined && label.get.attrs.get( "for" ).isEmpty )
		//				{
		//					val id: Option[String] = input.attrs.get( "id" ).orElse( input.attrs.get( "name" ).map( "_" + _ ) )
		//
		//					style.build(
		//						id.fold[Input[_]]( input )( id => input % ( "id" -> id ) ),
		//						id.fold( label )( id => label.map( _ % ( "for" -> id ) ) ),
		//						message,
		//						attributes
		//					)
		//				}
		//				else
		//				{
		//					style.build( input, label, message, attributes )
		//				}
		//			}
		//		}
		object Message
		{
			import com.taig.bootstrapper.Form.Message

			class Default(text: String, attributes: Attributes) extends Message( None, text, attributes )

			object Default
			{
				def apply(text: String, attributes: Attributes = Attributes.empty) = new Default( text, attributes )
			}

			class Error(text: String, attributes: Attributes) extends Message( "error", text, attributes )

			object Error
			{
				def apply(text: String, attributes: Attributes = Attributes.empty) = new Error( text, attributes )
			}
		}

		/**
		 * @see [[http://twitter.github.io/bootstrap/base-css.html#forms"]] (see "Supported form controls")
		 * @see [[com.taig.bootstrapper.Form.Element]]
		 */
		object Element
		{
			import com.taig.bootstrapper.Form.Element.{Input, TextArea}
			import com.taig.bootstrapper.Form.Element.Input.Type

			object Input
			{
				/**
				 * Render an Input Field (<code>&lt;input /&gt;</code>).
				 *
				 * @param `type` The Input tag's <code>type</code> attribute value. Either [[Type.Text]], [[Type.Password]],
				 *               [[Type.Radio]] or [[Type.Checkbox]].
				 * @param name The Input tag's <code>name</code> attribute value (default: [[scala.None]]).
				 * @param attributes Additional attributes that will be added to the HTML tag.
				 * @return The HTML representation of the Input element.
				 */
				def apply(`type`: Type, name: Option[String] = None, attributes: Attributes = Attributes.empty): Input =
				{
					new Input( `type`, name, attributes )
				}

				object Type
				{
					case object Checkbox extends Type( "checkbox" )
					case object Password extends Type( "password" )
					case object Radio extends Type( "radio" )
					case object Text extends Type( "text" )
				}

				object Text
				{
					def apply( name: Option[String] = None, value: Option[String] = None, placeholder: Option[String], attributes: Attributes = Attributes.empty ): Input =
					{
						Input( Type.Text, name, attributes ++ Attributes( "value" -> value.orNull, "placeholder" -> placeholder.orNull ) )
					}
				}
			}

			object TextArea
			{
				def apply(name: Option[String] = None, attributes: Attributes = Attributes.empty): TextArea =
				{
					new TextArea( name, attributes )
				}
			}
		}
	}

	/**
	 * @see [[http://twitter.github.io/bootstrap/base-css.html#icons]]
	 * @see [[com.taig.bootstrapper.Icon]]
	 */
	object Icon
	{
		import com.taig.bootstrapper.Icon.Color

		/**
		 * Render an Icon.
		 *
		 * @param image The Icon's [[http://twitter.github.io/bootstrap/base-css.html#icons name]] (e.g. "heart" or
		 *              "user").
		 * @param color The Icon's color. Either [[Color.Black]] or [[Color.White]].
		 * @param attributes Additional attributes that will be added to the HTML tag.
		 * @return The HTML representation of the Icon.
		 */
		def apply(image: String, color: Color, attributes: Attributes = Attributes.empty): Icon =
		{
			new Icon( image, color, attributes )
		}

		object Color
		{
			case object Black extends Color( None )
			case object White extends Color( "white" )
		}
	}

	/**
	 * @see [[com.taig.bootstrapper.Label]]
	 */
	object Label
	{
		def apply(text: String, `for`: Option[String] = None, attributes: Attributes = Attributes.empty): Label =
		{
			new Label( text, `for`, attributes )
		}
	}
}