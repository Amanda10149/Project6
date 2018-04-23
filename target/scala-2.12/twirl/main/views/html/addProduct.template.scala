
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/main("Add Product", user)/*7.27*/ {_display_(Seq[Any](format.raw/*7.29*/("""
    """),format.raw/*8.5*/("""<p class="lead">Add a new product</p>

    """),_display_(/*10.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*10.105*/{_display_(Seq[Any](format.raw/*10.106*/("""
        """),format.raw/*11.37*/("""
        """),format.raw/*12.99*/("""
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""


        """),_display_(/*16.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*16.85*/("""
        """),_display_(/*17.10*/inputText(productForm("description"), '_label -> "descripton", 'class -> "form-control")),format.raw/*17.98*/("""
        """),_display_(/*18.10*/inputText(productForm("stock"), '_label -> "stock", 'class -> "form-control")),format.raw/*18.87*/("""
        """),_display_(/*19.10*/inputText(productForm("price"), '_label -> "Price", 'class ->"form-control")),format.raw/*19.86*/("""

        """),_display_(/*21.10*/inputText(productForm("id"), '_label ->"", 'hidden ->"hidden")),format.raw/*21.72*/("""


        """),format.raw/*24.9*/("""<div class="actions">
                <input type="submit" value="Add/Update Product" class="btn btn-primary">
                <a href+""""),_display_(/*26.27*/routes/*26.33*/.HomeController.index),format.raw/*26.54*/("""">
                    <button type="button" class+"btn btn-warning"> Cancel </button>
                
                </a>
        </div>
    """)))}),format.raw/*31.6*/("""   
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 13:04:20 IST 2018
                  SOURCE: /home/wdd/Downloads/Project5-master/app/views/addProduct.scala.html
                  HASH: 5850f599c7383f2ed239618bfe666c24cfd7a00e
                  MATRIX: 985->1|1118->64|1163->61|1191->80|1220->84|1253->109|1292->111|1323->116|1393->160|1502->259|1542->260|1579->297|1616->396|1653->406|1666->410|1697->420|1736->432|1832->507|1869->517|1978->605|2015->615|2113->692|2150->702|2247->778|2285->789|2368->851|2406->862|2570->999|2585->1005|2627->1026|2802->1171
                  LINES: 28->1|31->3|34->1|36->4|39->7|39->7|39->7|40->8|42->10|42->10|42->10|43->11|44->12|45->13|45->13|45->13|48->16|48->16|49->17|49->17|50->18|50->18|51->19|51->19|53->21|53->21|56->24|58->26|58->26|58->26|63->31
                  -- GENERATED --
              */
          