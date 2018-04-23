
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

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
			
			"""),format.raw/*11.4*/("""<main>
	<div id="columns">
	<div id="leftCol">
	<div class="outerColDiv">
	<div>
	<!-- CONTENT GOES HERE -->
	<h4>Contact Information</h4>
	<ul>
	<li>Ph: 01 298 1234</li><br>
	<li>Fax: 01 298 9876</li><br>
	
	<li>
	Post: 
	<ul>	
	<li>Computer Hub,</li><br>
	<li>Block 2B</li><br>
	<li>Sandyford Business Park,</li><br>
	<li>Sandyford,</li><br>
	<li>Dublin 18.</li>
	</ul>	
	</li>
	<li></li>
	</ul>
	</div>
	</div>
	
	</div>
	
	<div id="centreCol">
	<div class="outerColDiv">
	<div>
	<!-- CONTENT GOES HERE -->
	<h3>About Us</h3>
	<p>We were founded in 2005.</p>
	<br>
	<h4>Our goals</h4>
	<p>We strive to provide great quality products made from the best materials. We wish to provide fast shipping. </p>
	
	<h4>Money-back guarantee</h4>	
	<p>We offer a 14-day cooling off period. So if you're not completely satisfied with your order, you can send it back to us, no questions asked!</p>
	<h4>Real-time order tracking</h4>	
	<p>Sign in to your account to track the status of your order in real time.<br> You will also receive emails at each step of the delivery process, from picking & packing to shipping.</p>
	</div>
	</div>
	</div>
	</div>
	<map name="facebook" id="facebook">
	<area href="https://www.facebook.com/" shape="circle" coords="100, 80,80,50" alt="fb"/>
	<area href="https://twitter.com/" shape="circle" coords="300, 80,80,80" alt="tw"/>
	<area href="https://www.instagram.com/" shape="circle" coords="500, 80,80,50" alt="in"/>
	</map>
	<img src="/assets/images/follow.png" usemap="#facebook" alt"wh"width="570" height="200"/>
	</main>
""")))}),format.raw/*64.2*/("""
	"""),format.raw/*65.2*/("""<footer>
	Copyright &copy; 
	</footer>
	</div>
	</body>
</html>"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 13:04:20 IST 2018
                  SOURCE: /home/wdd/Downloads/Project5-master/app/views/about.scala.html
                  HASH: 688f1d35724b02a1ce6117fc712bebe307e90c61
                  MATRIX: 959->1|1079->26|1106->27|1224->120|1251->139|1290->141|1325->149|2907->1701|2936->1703
                  LINES: 28->1|33->1|34->2|41->9|41->9|41->9|43->11|96->64|97->65
                  -- GENERATED --
              */
          