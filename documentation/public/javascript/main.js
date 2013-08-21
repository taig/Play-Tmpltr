$( document ).ready( function()
{
	$( 'pre.code' ).each( function( index, element )
	{
		hljs.highlightBlock( element )
	} );
} );