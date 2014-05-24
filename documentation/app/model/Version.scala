package model

import play.core.PlayVersion
import com.taig.BuildInfo

object Version
{
	lazy val play = PlayVersion.current

	lazy val tmpltr = BuildInfo.version
}