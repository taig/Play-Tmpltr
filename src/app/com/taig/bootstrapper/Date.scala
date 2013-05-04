package com.taig.bootstrapper

import java.text.SimpleDateFormat
import org.joda.time.{Hours, DateTime}
import org.joda.time.Hours.hoursBetween

object Date
{
	private val date = new SimpleDateFormat( "dd.MM.yyyy" )

	private val time = new SimpleDateFormat( "hh:mm" )

	def format(date: java.util.Date): String =
	{
		format( Some( date ) )
	}

	def format(date: Option[java.util.Date], placeholder: String = " - "): String =
	{
		date match
		{
			case Some( date ) =>
				if( hoursBetween( new DateTime( date ), DateTime.now() ).isLessThan( Hours.hours( 24 ) ) )
				{
					this.time.format( date ) + " Uhr"
				}
				else
				{
					this.date.format( date )
				}
			case None => placeholder
		}
	}
}