
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>

<html>
	<head>
		
		<meta charset="UTF-8">
		<title>Computer Hub</title>
		"""),_display_(/*9.4*/main("Login", user)/*9.23*/ {_display_(Seq[Any](format.raw/*9.25*/("""

"""),format.raw/*11.1*/("""<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Best selling laptop!</div>
        <div class="panel-body"><img src="/assets/images/Inspiron.jpg" alt="Inspiron" class="productImg" style="height: 13em"></div>
        <div class="panel-footer">Dell inspiron</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Low Prices on iPhones!</div>
        <div class="panel-body"><img src="/assets/images/iphoneX.jpg" alt="iPhoneX img" class="iPhoneX" style="height: 13em"></div>
        <div class="panel-footer">New iPhone X only 999!</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Limited sales on selected TVs!</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img3.jpg" alt="49' Samsung Smart TV" class="productImg" style="height: 13em"></div>
        <div class="panel-footer">Save over $200</div>
      </div>
    </div>
  </div>
</div><br>
    """)))}),format.raw/*36.6*/("""
"""),format.raw/*37.1*/("""<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline">Get deals:
    <input type="email" class="form-control" size="50" placeholder="Email Address">
    <button type="button" class="btn btn-danger">Sign Up</button>
  </form>
</footer>

</body>
</html>
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 15:12:54 IST 2018
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/index.scala.html
                  HASH: 213a86f233a9b629d48dbc830b8752ceb3f1baa6
                  MATRIX: 959->1|1079->26|1106->27|1224->120|1251->139|1290->141|1319->143|2482->1276|2510->1277
                  LINES: 28->1|33->1|34->2|41->9|41->9|41->9|43->11|68->36|69->37
                  -- GENERATED --
              */
          