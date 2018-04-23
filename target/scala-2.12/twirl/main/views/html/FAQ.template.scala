
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

object FAQ extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Question],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(QuestionForm : Form[models.Question], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.65*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>CA2</title>
    """),_display_(/*9.6*/main("Login", user)/*9.25*/ {_display_(Seq[Any](format.raw/*9.27*/("""
			"""),format.raw/*10.4*/("""<main>
				<div id="columns">
					<div id="leftCol">
						<div class="outerColDiv">
							<div class="col-sm-5">
      <p>If you're question isint answered in the FAQ you can submit your own question here and one of our staff will respond within 24 hours. </p>
	  
      <p><span class="glyphicon glyphicon-map-marker"></span> Sandyford, Dublin</p>
      <p><span class="glyphicon glyphicon-phone"></span> 01 820876</p>
      
    </div>
						</div>
					
          </div>
          """),_display_(/*24.12*/main("Add Question", user)/*24.38*/ {_display_(Seq[Any](format.raw/*24.40*/("""
            """),format.raw/*25.13*/("""<p class="lead">Ask a question</p>
        
            """),_display_(/*27.14*/form(action=routes.HomeController.addQuestionSubmit(), 'class -> "form-horizontal", 'role -> "form")/*27.114*/{_display_(Seq[Any](format.raw/*27.115*/("""
                """),format.raw/*28.45*/("""
                """),format.raw/*29.107*/("""
                """),_display_(/*30.18*/CSRF/*30.22*/.formField),format.raw/*30.32*/("""
        
        
                """),_display_(/*33.18*/inputText(QuestionForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*33.94*/("""
                """),_display_(/*34.18*/inputText(QuestionForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*34.96*/("""
                """),_display_(/*35.18*/inputText(QuestionForm("question"), '_label -> "Question", 'class -> "form-control")),format.raw/*35.102*/("""
               
        
               
        
        
                """),format.raw/*41.17*/("""<div class="actions">
                        <input type="submit" value="AddQuestion" class="btn btn-primary">
                        <a href=""""),_display_(/*43.35*/routes/*43.41*/.HomeController.FAQ),format.raw/*43.60*/("""">
                            <button type="button" class="btn btn-warning"> Cancel </button>
                        
                        </a>
                </div>
            """)))}),format.raw/*48.14*/("""   
        """)))}),format.raw/*49.10*/("""
          
					
					"""),format.raw/*52.6*/("""<div id="centreCol">
						<div class="outerColDiv">
							<div>
<!-- Accordain -->
<button class="accordion">Q1</button>
<div class="panel">
  <p>Question!!!!</p>
</div>

<button class="accordion">Q2</button>
<div class="panel">
  <p>Question!!!!</p>
</div>

</div><button class="accordion">Q3</button>
<div class="panel">
  <p>Question!!!!</p>
</div>

<!-- JS For Accordain-->
<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) """),format.raw/*76.34*/("""{"""),format.raw/*76.35*/("""
  """),format.raw/*77.3*/("""acc[i].addEventListener("click", function() """),format.raw/*77.47*/("""{"""),format.raw/*77.48*/("""
    """),format.raw/*78.5*/("""this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight)"""),format.raw/*80.31*/("""{"""),format.raw/*80.32*/("""
      """),format.raw/*81.7*/("""panel.style.maxHeight = null;
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/(""" """),format.raw/*82.7*/("""else """),format.raw/*82.12*/("""{"""),format.raw/*82.13*/("""
      """),format.raw/*83.7*/("""panel.style.maxHeight = panel.scrollHeight + "px";
    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/(""" 
  """),format.raw/*85.3*/("""}"""),format.raw/*85.4*/(""");
"""),format.raw/*86.1*/("""}"""),format.raw/*86.2*/("""
"""),format.raw/*87.1*/("""</script>



											<!-- Container (Contact Section) -->

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

    """)))}),format.raw/*105.6*/("""
			"""),format.raw/*106.4*/("""<footer>
				Copyright &copy; 2018
			</footer>
		</div>
	</body>
</html>"""))
      }
    }
  }

  def render(QuestionForm:Form[models.Question],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(QuestionForm,user)

  def f:((Form[models.Question],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (QuestionForm,user) => apply(QuestionForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 14:01:52 IST 2018
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/FAQ.scala.html
                  HASH: 2f702af76ee71b131f8243698c45fe0e996db972
                  MATRIX: 979->1|1115->66|1160->64|1187->83|1214->84|1308->153|1335->172|1374->174|1405->178|1920->666|1955->692|1995->694|2036->707|2120->764|2230->864|2270->865|2315->910|2361->1017|2406->1035|2419->1039|2450->1049|2513->1085|2610->1161|2655->1179|2754->1257|2799->1275|2905->1359|3009->1435|3182->1581|3197->1587|3237->1606|3453->1791|3497->1804|3547->1827|4061->2313|4090->2314|4120->2317|4192->2361|4221->2362|4253->2367|4385->2471|4414->2472|4448->2479|4509->2513|4537->2514|4565->2515|4598->2520|4627->2521|4661->2528|4743->2583|4771->2584|4802->2588|4830->2589|4860->2592|4888->2593|4916->2594|5483->3130|5515->3134
                  LINES: 28->1|31->2|34->1|35->3|36->4|41->9|41->9|41->9|42->10|56->24|56->24|56->24|57->25|59->27|59->27|59->27|60->28|61->29|62->30|62->30|62->30|65->33|65->33|66->34|66->34|67->35|67->35|73->41|75->43|75->43|75->43|80->48|81->49|84->52|108->76|108->76|109->77|109->77|109->77|110->78|112->80|112->80|113->81|114->82|114->82|114->82|114->82|114->82|115->83|116->84|116->84|117->85|117->85|118->86|118->86|119->87|137->105|138->106
                  -- GENERATED --
              */
          