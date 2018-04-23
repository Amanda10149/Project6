
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
      <p>If you're question is not answered in the FAQ you can submit your own question here and one of our staff will respond within 24 hours. </p>
	  
      <p><span class="glyphicon glyphicon-map-marker"></span> Sandyford, Dublin</p>
      <p><span class="glyphicon glyphicon-phone"></span> 01 820876</p>
      
    </div>
						</div>
					</div>
          
          
          <div id="centreCol">
             
              <div>   
        <p class="lead">Ask a question</p>
        
            """),_display_(/*30.14*/form(action=routes.HomeController.addQuestionSubmit(), 'class -> "form-horizontal", 'role -> "form")/*30.114*/{_display_(Seq[Any](format.raw/*30.115*/("""
                """),format.raw/*31.45*/("""
                """),format.raw/*32.107*/("""
                """),_display_(/*33.18*/CSRF/*33.22*/.formField),format.raw/*33.32*/("""
        
        
                """),_display_(/*36.18*/inputText(QuestionForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*36.94*/("""
                """),_display_(/*37.18*/inputText(QuestionForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*37.96*/("""
                """),_display_(/*38.18*/inputText(QuestionForm("question"), '_label -> "Question", 'class -> "form-control")),format.raw/*38.102*/("""
               
        
               
        
       
                """),format.raw/*44.17*/("""<div class="actions">
                        <input type="submit" value="Submit \Question" class="btn btn-primary">
                        <a href=""""),_display_(/*46.35*/routes/*46.41*/.HomeController.FAQ),format.raw/*46.60*/("""">
                            <button type="button" class="btn btn-warning"> Cancel </button>
                        
                        </a>
                </div>
            """)))}),format.raw/*51.14*/("""   
        
          
					
				
							"""),format.raw/*56.8*/("""<div>

    </head>
    <body>
    
    <h2>Frequently Asked Questions</h2>
    <p>Click on the buttons to open the collapsible content.</p>
    
    <button class="accordion">Do you ship internationally? </button>
    <div class="panel">
      <p>Yes, we do ship internationally. We only ask that you pay for shipping or any taxes that your package incurs through customs.</p>
    </div>
    
    <button class="accordion">Is it possible to purchase an extended warrenty?</button>
    <div class="panel">
      <p>You may upgrade the warranty within the first thirty days of purchase</p>
    </div>
    
    <button class="accordion">I have no video signal, what should I do?</button>
    <div class="panel">
      <ul>
        <li>Check all cable connections from your monitor to your system make sure they are not loose and properly connected.</li>
          <li>Confirm that you are not connecting the monitor to the onboard video output and are connecting the monitor to the video card.</li>
          <li>On the monitor make sure to change between the input sources, most monitors will have the feature for selecting the input that the monitor is receiving a signal from. Make sure you have selected the proper input.</li>
    </div>
    
    <script>
    var acc = document.getElementsByClassName("accordion");
    var i;
    
    for (i = 0; i < acc.length; i++) """),format.raw/*86.38*/("""{"""),format.raw/*86.39*/("""
      """),format.raw/*87.7*/("""acc[i].addEventListener("click", function() """),format.raw/*87.51*/("""{"""),format.raw/*87.52*/("""
        """),format.raw/*88.9*/("""this.classList.toggle("active");
        var panel = this.nextElementSibling;
        if (panel.style.maxHeight)"""),format.raw/*90.35*/("""{"""),format.raw/*90.36*/("""
          """),format.raw/*91.11*/("""panel.style.maxHeight = null;
        """),format.raw/*92.9*/("""}"""),format.raw/*92.10*/(""" """),format.raw/*92.11*/("""else """),format.raw/*92.16*/("""{"""),format.raw/*92.17*/("""
          """),format.raw/*93.11*/("""panel.style.maxHeight = panel.scrollHeight + "px";
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/(""" 
      """),format.raw/*95.7*/("""}"""),format.raw/*95.8*/(""");
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/("""
    """),format.raw/*97.5*/("""</script>



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

    """)))}),format.raw/*115.6*/("""
			"""),format.raw/*116.4*/("""<footer>
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
                  DATE: Mon Apr 23 16:25:51 IST 2018
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/FAQ.scala.html
                  HASH: 9cfd77ccef837e926a92e287a98f52378841cc57
                  MATRIX: 979->1|1115->66|1160->64|1187->83|1214->84|1308->153|1335->172|1374->174|1405->178|2054->800|2164->900|2204->901|2249->946|2295->1053|2340->1071|2353->1075|2384->1085|2447->1121|2544->1197|2589->1215|2688->1293|2733->1311|2839->1395|2942->1470|3120->1621|3135->1627|3175->1646|3391->1831|3460->1873|4858->3243|4887->3244|4921->3251|4993->3295|5022->3296|5058->3305|5198->3417|5227->3418|5266->3429|5331->3467|5360->3468|5389->3469|5422->3474|5451->3475|5490->3486|5576->3545|5605->3546|5640->3554|5668->3555|5702->3562|5730->3563|5762->3568|6329->4104|6361->4108
                  LINES: 28->1|31->2|34->1|35->3|36->4|41->9|41->9|41->9|42->10|62->30|62->30|62->30|63->31|64->32|65->33|65->33|65->33|68->36|68->36|69->37|69->37|70->38|70->38|76->44|78->46|78->46|78->46|83->51|88->56|118->86|118->86|119->87|119->87|119->87|120->88|122->90|122->90|123->91|124->92|124->92|124->92|124->92|124->92|125->93|126->94|126->94|127->95|127->95|128->96|128->96|129->97|147->115|148->116
                  -- GENERATED --
              */
          