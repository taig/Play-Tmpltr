$( document ).ready( function()
{
	$( '.example pre' ).each( function( index, element )
	{
		hljs.highlightBlock( element )
	} );
} );