import com.taig.tmpltr._
import com.taig.tmpltr.engine.html._
import play.api.templates.Txt

package object widget
{
	implicit def spanFromString( string: String ): markup.span = span( Txt( string ) ) 
}