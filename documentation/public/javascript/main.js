$( document ).ready( function()
{
	$( '.highlight pre code' ).each( function( index, element )
	{
		hljs.highlightBlock( element )
	} );
} );