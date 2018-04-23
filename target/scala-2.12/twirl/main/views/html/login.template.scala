
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
    """),_display_(/*5.6*/main("Login", user)/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
       
        """),format.raw/*7.9*/("""<!--HTML content for the index view -->
        <div class="col-xs-4">
            <h3>Sign in</h3>
            <!-- Display login errors if they exist -->
            """),_display_(/*11.14*/if(loginForm.hasGlobalErrors)/*11.43*/ {_display_(Seq[Any](format.raw/*11.45*/("""
                """),format.raw/*12.17*/("""<p class="alert alert-warning">
                    """),_display_(/*13.22*/loginForm/*13.31*/.globalError.message),format.raw/*13.51*/("""
                """),format.raw/*14.17*/("""</p>
            """)))}),format.raw/*15.14*/("""
            """),_display_(/*16.14*/if(flash.containsKey("error"))/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/("""
                """),format.raw/*17.17*/("""<p class="alert alert-warning">
                    """),_display_(/*18.22*/flash/*18.27*/.get("loginRequired")),format.raw/*18.48*/("""
                """),format.raw/*19.17*/("""</p>
             """)))}),format.raw/*20.15*/("""
    """),format.raw/*21.5*/("""<!-- The login form -->
            """),_display_(/*22.14*/helper/*22.20*/.form(action = controllers.routes.LoginController.loginSubmit())/*22.84*/ {_display_(Seq[Any](format.raw/*22.86*/("""
             """),format.raw/*23.42*/("""
             """),format.raw/*24.103*/("""
             """),_display_(/*25.15*/CSRF/*25.19*/.formField),format.raw/*25.29*/("""

             """),format.raw/*27.14*/("""<div class-"form-group">
                """),_display_(/*28.18*/inputText(loginForm("email"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*29.76*/("""
            """),format.raw/*30.13*/("""</div>
            <div class-"form-group">
                """),_display_(/*32.18*/inputPassword(loginForm("password"), '_label -> "",
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*33.79*/("""
            """),format.raw/*34.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*38.10*/(""" """),format.raw/*38.27*/("""
        """),format.raw/*39.9*/("""</div>
        <!-- End of content for main -->
""")))}),format.raw/*41.2*/("""



"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 14:01:52 IST 2018
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/login.scala.html
                  HASH: abd438de7fbec6d15aedceeb957af997ad546ed9
                  MATRIX: 984->1|1119->65|1164->63|1191->81|1219->154|1250->160|1277->179|1316->181|1359->198|1555->367|1593->396|1633->398|1678->415|1758->468|1776->477|1817->497|1862->514|1911->532|1952->546|1991->576|2031->578|2076->595|2156->648|2170->653|2212->674|2257->691|2307->710|2339->715|2403->752|2418->758|2491->822|2531->824|2573->866|2616->969|2658->984|2671->988|2702->998|2745->1013|2814->1055|2955->1175|2996->1188|3084->1249|3235->1379|3276->1392|3457->1542|3486->1559|3522->1568|3601->1617
                  LINES: 28->1|31->2|34->1|35->3|36->4|37->5|37->5|37->5|39->7|43->11|43->11|43->11|44->12|45->13|45->13|45->13|46->14|47->15|48->16|48->16|48->16|49->17|50->18|50->18|50->18|51->19|52->20|53->21|54->22|54->22|54->22|54->22|55->23|56->24|57->25|57->25|57->25|59->27|60->28|61->29|62->30|64->32|65->33|66->34|70->38|70->38|71->39|73->41
                  -- GENERATED --
              */
          