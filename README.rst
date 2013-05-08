Xitrum allows you to choose template engines.
This library is a template engine for Xitrum.
It wraps `ScalaTags <https://github.com/lihaoyi/scalatags>`_.

Config your Xitrum project to use this template engine
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Add to your Xitrum project's build.sbt:

::

  // Template engine for Xitrum
  libraryDependencies += "tv.cntt" %% "xitrum-scalatags" % "1.0"

Edit config/xitrum.conf:

::

  templateEngine = xitrum.view.ScalaTags

View
~~~~



Fragment
~~~~~~~~
