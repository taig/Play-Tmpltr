import com.taig.tmpltr._
import com.taig.tmpltr.engine.html._
import play.api.templates.Txt
import widget.bootstrap.icon

package object widget
{
	implicit def spanFromString( string: String ): markup.span = span( Txt( string ) ) 
}