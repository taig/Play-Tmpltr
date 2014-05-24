package widget

package object bootstrap
{
	implicit def imageFromString( string: String ) = new icon.image( string )
}