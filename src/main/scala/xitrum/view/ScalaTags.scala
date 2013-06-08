package xitrum.view

import org.jboss.netty.handler.codec.serialization.ClassResolvers
import xitrum.{Config, Action}

class ScalaTags extends TemplateEngine {
  /**
   * Renders the template at the location identified by the given action class.
   *
   * Ex: When location = myapp.SiteIndex,
   * the template class will be:
   * scalatags.myapp.SiteIndex
   *
   * You should save it to:
   * src/main/scala/scalatags/myapp/SiteIndex.scala
   *
   * @param location the action class used to identify the template location
   *
   * @param options specific to the configured template engine
   */
  def renderView(location: Class[_ <: Action], currentAction: Action, options: Map[String, Any]): String =
    ScalaTags.renderView(location, currentAction, options)

  /**
   * Renders the template at the location identified by the package of the given
   * action class and the given fragment.
   *
   * Ex: When location = myapp.ArticleNew, fragment = form,
   * the template class will be:
   * scalatags.myapp._form
   *
   * You should save it to:
   * src/main/scala/scalatags/myapp/_form.scala
   *
   * @param location the action class used to identify the template location
   *
   * @param options specific to the configured template engine
   */
  def renderFragment(location: Class[_ <: Action], fragment: String, currentAction: Action, options: Map[String, Any]): String =
    ScalaTags.renderFragment(location, fragment, currentAction, options)
}

object ScalaTags {
  private[this] val classResolver = ClassResolvers.softCachingConcurrentResolver(getClass.getClassLoader)

  def renderView(location: Class[_ <: Action], currentAction: Action, options: Map[String, Any]): String = {
    val className = "scalatags." + location.getName
    val klass     = classResolver.resolve(className)
    klass.toString
  }

  def renderFragment(location: Class[_ <: Action], fragment: String, currentAction: Action, options: Map[String, Any]): String = {
    val className = "scalatags." + location.getPackage.getName
    val klass     = classResolver.resolve(className)
    klass.toString
  }
}
