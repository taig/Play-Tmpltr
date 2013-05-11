package com.taig.tmpltr

import play.api.templates.{Txt => Text}
import play.api.templates.{Html => HTML}
import scala.xml.{NodeSeq, Unparsed}
import play.api.mvc.Content

abstract class Tag[T <: Tag[T]] protected(tag: String, attributes: Attributes = Attributes.empty, content: Option[Content] = None, minimizeEmpty: Boolean = true) extends HtmlNode[T](
	tag, minimizeEmpty, content.fold( NodeSeq.Empty )( content => Unparsed( content.body.trim ) ), attributes
)

object Tag
{
	implicit def contentToOption( content: Content ): Option[Content] = Some( content )

	abstract class Html[H <: Html[H]](attributes: Attributes)(content: HTML) extends Tag[H]( "html", attributes, content )
	object Html
	{
		abstract class Head[H <: Head[H]](attributes: Attributes)(content: HTML) extends Tag[H]( "head", attributes, content )
		object Head
		{
			abstract class Base[B <: Base[B]](attributes: Attributes) extends Tag[B]( "base", attributes )

			abstract class Link[L <: Link[L]](attributes: Attributes) extends Tag[L]( "link", attributes )

			abstract class Meta[M <: Meta[M]](attributes: Attributes) extends Tag[M]( "meta", attributes )

			abstract class Style[S <: Style[S]](attributes: Attributes)(content: Text) extends Tag[S]( "style", attributes, content )

			abstract class Title[T <: Title[T]](attributes: Attributes)(content: Text) extends Tag[T]( "title", attributes, content )
		}

		abstract class Body[B <: Body[B]](attributes: Attributes)(content: HTML) extends Tag[B]( "body", attributes, content )
		object Body
		{
			trait List
			{
				abstract class Item[I <: Item[I]](attributes: Attributes)(content: HTML) extends Tag[I]( "li", attributes, content )
			}

			trait Media
			{
				abstract class Source[S <: Source[S]](attributes: Attributes)(content: HTML) extends Tag[S]( "source", attributes, content )
			}

			trait Selection
			{
				abstract class Option[O <: Option[O]](attributes: Attributes)(content: HTML) extends Tag[O]( "option", attributes, content )
			}

			abstract class Abbreviation[A <: Abbreviation[A]](attributes: Attributes)(content: HTML) extends Tag[A]( "abbr", attributes, content )

			abstract class Address[A <: Address[A]](attributes: Attributes)(content: HTML) extends Tag[A]( "address", attributes, content )

			abstract class Article[A <: Article[A]](attributes: Attributes)(content: HTML) extends Tag[A]( "article", attributes, content )

			abstract class Aside[A <: Aside[A]](attributes: Attributes)(content: HTML) extends Tag[A]( "aside", attributes, content )

			abstract class Audio[A <: Audio[A]](attributes: Attributes)(content: HTML) extends Tag[A]( "audio", attributes, content )
			object Audio extends Media

			abstract class BiDirectionalOverride[B <: BiDirectionalOverride[B]](attributes: Attributes)(content: HTML) extends Tag[B]( "bdo", attributes, content )

			abstract class Blockquote[B <: Blockquote[B]](attributes: Attributes)(content: HTML) extends Tag[B]( "blockquote", attributes, content )

			abstract class Definitions[D <: Definitions[D]](attributes: Attributes)(content: HTML) extends Tag[D]( "dl", attributes, content )
			object Definitions
			{
				abstract class Definition[D <: Definition[D]](attributes: Attributes)(content: HTML) extends Tag[D]( "dd", attributes, content )

				abstract class Term[T <: Term[T]](attributes: Attributes)(content: HTML) extends Tag[T]( "dt", attributes, content )
			}

			abstract class Break[B <: Break[B]](attributes: Attributes) extends Tag[B]( "br", attributes )

			abstract class Button[B <: Button[B]](attributes: Attributes)(content: HTML) extends Tag[B]( "button", attributes, content )

			abstract class Canvas[C <: Canvas[C]](attributes: Attributes)(content: HTML) extends Tag[C]( "canvas", attributes, content )

			abstract class Cite[C <: Cite[C]](attributes: Attributes)(content: HTML) extends Tag[C]( "cite", attributes, content )

			abstract class Code[C <: Code[C]](attributes: Attributes)(content: HTML) extends Tag[C]( "code", attributes, content )

			abstract class Data[D <: Data[D]](attributes: Attributes)(content: HTML) extends Tag[D]( "datalist", attributes, content )
			object Data extends Selection

			abstract class Definition[D <: Definition[D]](attributes: Attributes)(content: HTML) extends Tag[D]( "dfn", attributes, content )

			abstract class Deleted[D <: Deleted[D]](attributes: Attributes)(content: HTML) extends Tag[D]( "del", attributes, content )

			abstract class Details[D <: Details[D]](attributes: Attributes)(content: HTML) extends Tag[D]( "details", attributes, content )
			object Details
			{
				abstract class Summary[S <: Summary[S]](attributes: Attributes)(content: HTML) extends Tag[S]( "summary", attributes, content )
			}

			abstract class Dialog[D <: Dialog[D]](attributes: Attributes)(content: HTML) extends Tag[D]( "dialog", attributes, content )

			abstract class Division[D <: Division[D]](attributes: Attributes)(content: HTML) extends Tag[D]( "div", attributes, content )

			abstract class Embed[E <: Embed[E]](attributes: Attributes)(content: HTML) extends Tag[E]( "embed", attributes, content )

			abstract class Emphasis[E <: Emphasis[E]](attributes: Attributes)(content: HTML) extends Tag[E]( "em", attributes, content )

			abstract class Figure[F <: Figure[F]](attributes: Attributes)(content: HTML) extends Tag[F]( "figure", attributes, content )
			object Figure
			{
				abstract class Caption[C <: Caption[C]](attributes: Attributes)(content: HTML) extends Tag[C]( "figcaption", attributes, content )
			}

			abstract class Footer[F <: Footer[F]](attributes: Attributes)(content: HTML) extends Tag[F]( "footer", attributes, content )

			abstract class FormattedText[F <: FormattedText[F]](attributes: Attributes)(content: HTML) extends Tag[F]( "pre", attributes, content )

			abstract class Form[T <: Form[T]](attributes: Attributes)(content: HTML) extends Tag[T]( "form", attributes, content )
			object Form
			{
				abstract class Fieldset[F <: Fieldset[F]](attributes: Attributes)(content: HTML) extends Tag[F]( "fieldset", attributes, content )

				abstract class Input[I <: Input[I]](attributes: Attributes)(content: HTML) extends Tag[I]( "input", attributes, content )

				abstract class KeyGenerator[K <: KeyGenerator[K]](attributes: Attributes)(content: HTML) extends Tag[K]( "keygen", attributes, content )

				abstract class Label[L <: Label[L]](attributes: Attributes)(content: HTML) extends Tag[L]( "label", attributes, content )

				abstract class Legend[L <: Legend[L]](attributes: Attributes)(content: HTML) extends Tag[L]( "legend", attributes, content )

				abstract class Output[O <: Output[O]](attributes: Attributes)(content: HTML) extends Tag[O]( "output", attributes, content )

				abstract class Select[S <: Select[S]](attributes: Attributes)(content: HTML) extends Tag[S]( "select", attributes, content )
				object Select
				{
					abstract class Options[O <: Options[O]](attributes: Attributes)(content: HTML) extends Tag[O]( "optgroup", attributes, content )
					object Options extends Selection
				}

				abstract class TextArea[T <: TextArea[T]](attributes: Attributes)(content: Text) extends Tag[T]( "textarea", attributes, content )
			}

			abstract class Header[H <: Header[H]](attributes: Attributes)(content: HTML) extends Tag[H]( "header", attributes, content )

			abstract class HorizontalRuler[H <: HorizontalRuler[H]](attributes: Attributes) extends Tag[H]( "hr", attributes )

			abstract class Headings[H <: Headings[H]](attributes: Attributes)(content: HTML) extends Tag[H]( "hgroup", attributes, content )
			object Headings
			{
				abstract class Heading[H <: Heading[H]](level: Int, attributes: Attributes)(content: HTML) extends Tag[H]( "h" + level, attributes, content )
				{
					require( level >= 1 && level <= 6 )
				}
			}

			abstract class HyperLink[H <: HyperLink[H]](attributes: Attributes)(content: HTML) extends Tag[H]( "a", attributes, content )

			abstract class InlineFrame[I <: InlineFrame[I]](attributes: Attributes)(content: HTML) extends Tag[I]( "iframe", attributes, content )

			abstract class Image[I <: Image[I]](attributes: Attributes) extends Tag[I]( "image", attributes )

			abstract class Inserted[I <: Inserted[I]](attributes: Attributes)(content: HTML) extends Tag[I]( "ins", attributes, content )

			abstract class Keyboard[K <: Keyboard[K]](attributes: Attributes)(content: HTML) extends Tag[K]( "kbd", attributes, content )

			abstract class Map[M <: Map[M]](attributes: Attributes)(content: HTML) extends Tag[M]( "map", attributes, content )
			object Map
			{
				abstract class Area[A <: Area[A]](attributes: Attributes)(content: HTML) extends Tag[A]( "area", attributes, content )
			}

			abstract class Mark[M <: Mark[M]](attributes: Attributes)(content: HTML) extends Tag[M]( "mark", attributes, content )

			abstract class Meter[M <: Meter[M]](attributes: Attributes)(content: HTML) extends Tag[M]( "meter", attributes, content )

			abstract class Nav[N <: Nav[N]](attributes: Attributes)(content: HTML) extends Tag[N]( "nav", attributes, content )

			abstract class Object[O <: Object[O]](attributes: Attributes)(content: HTML) extends Tag[O]( "object", attributes, content )
			object Object
			{
				abstract class Parameter[P <: Parameter[P]](attributes: Attributes)(content: HTML) extends Tag[P]( "param", attributes, content )
			}

			abstract class OrderedList[O <: OrderedList[O]](attributes: Attributes)(content: HTML) extends Tag[O]( "ol", attributes, content )
			object OrderedList extends List

			abstract class Outdated[O <: Outdated[O]](attributes: Attributes)(content: HTML) extends Tag[O]( "s", attributes, content )

			abstract class Paragraph[P <: Paragraph[P]](attributes: Attributes)(content: HTML) extends Tag[P]( "p", attributes, content )

			abstract class Progress[P <: Progress[P]](attributes: Attributes)(content: HTML) extends Tag[P]( "progress", attributes, content )

			abstract class Quote[P <: Quote[P]](attributes: Attributes)(content: HTML) extends Tag[P]( "q", attributes, content )

			abstract class Ruby[R <: Ruby[R]](attributes: Attributes)(content: HTML) extends Tag[R]( "ruby", attributes, content )
			object Ruby
			{
				abstract class Rp[R <: Rp[R]](attributes: Attributes)(content: HTML) extends Tag[R]( "rp", attributes, content )
				abstract class Rt[R <: Rt[R]](attributes: Attributes)(content: HTML) extends Tag[R]( "tr", attributes, content )
			}

			abstract class Sample[S <: Sample[S]](attributes: Attributes)(content: HTML) extends Tag[S]( "samp", attributes, content )

			abstract class Section[S <: Section[S]](attributes: Attributes)(content: HTML) extends Tag[S]( "section", attributes, content )

			abstract class Small[S <: Small[S]](attributes: Attributes)(content: HTML) extends Tag[S]( "small", attributes, content )

			abstract class Span[S <: Span[S]](attributes: Attributes)(content: HTML) extends Tag[S]( "span", attributes, content )

			abstract class Subscript[S <: Subscript[S]](attributes: Attributes)(content: HTML) extends Tag[S]( "sub", attributes, content )

			abstract class Superscript[S <: Superscript[S]](attributes: Attributes)(content: HTML) extends Tag[S]( "sup", attributes, content )

			abstract class Strong[S <: Strong[S]](attributes: Attributes)(content: HTML) extends Tag[S]( "strong", attributes, content )

			abstract class Table[T <: Table[T]](attributes: Attributes)(content: HTML) extends Tag[T]( "table", attributes, content )
			object Table
			{
				abstract class Body[B <: Body[B]](attributes: Attributes)(content: HTML) extends Tag[B]( "tbody", attributes, content )

				abstract class Caption[C <: Caption[C]](attributes: Attributes)(content: HTML) extends Tag[C]( "caption", attributes, content )

				abstract class Columns[C <: Columns[C]](attributes: Attributes)(content: HTML) extends Tag[C]( "colgroup", attributes, content )
				object Columns
				{
					abstract class Column[C <: Column[C]](attributes: Attributes) extends Tag[C]( "col", attributes )
				}

				abstract class Footer[F <: Footer[F]](attributes: Attributes)(content: HTML) extends Tag[F]( "tfoot", attributes, content )

				abstract class Head[H <: Head[H]](attributes: Attributes)(content: HTML) extends Tag[H]( "thead", attributes, content )

				abstract class Row[R <: Row[R]](attributes: Attributes)(content: HTML) extends Tag[R]( "tr", attributes, content )
				object Row
				{
					abstract class Head[H <: Head[H]](attributes: Attributes)(content: HTML) extends Tag[H]( "th", attributes, content )

					abstract class Cell[C <: Cell[C]](attributes: Attributes)(content: HTML) extends Tag[C]( "td", attributes, content )
				}
			}

			abstract class Time[T <: Time[T]](attributes: Attributes)(content: HTML) extends Tag[T]( "time", attributes, content )

			abstract class UnorderedList[O <: UnorderedList[O]](attributes: Attributes)(content: HTML) extends Tag[O]( "ul", attributes, content )
			object UnorderedList extends List

			abstract class Variable[V <: Variable[V]](attributes: Attributes)(content: HTML) extends Tag[V]( "var", attributes, content )

			abstract class Video[V <: Video[V]](attributes: Attributes)(content: HTML) extends Tag[V]( "video", attributes, content )
			object Video extends Media
			{
				abstract class Track[T <: Track[T]](attributes: Attributes)(content: HTML) extends Tag[T]( "track", attributes, content )
			}

			abstract class WordBreak[W <: WordBreak[W]](attributes: Attributes)(content: HTML) extends Tag[W]( "wbr", attributes, content )
		}

		abstract class Script[S <: Script[S]](attributes: Attributes)(content: Text) extends Tag[S]( "script", attributes, content, false )
		object Script
		{
			abstract class Fallback[F <: Fallback[F]](attributes: Attributes)(content: HTML) extends Tag[F]( "noscript", attributes, content, false )
		}
	}
}