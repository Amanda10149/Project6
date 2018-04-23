
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
                        <input type="submit" value="Submit Question" class="btn btn-primary">
                        <a href=""""),_display_(/*46.35*/routes/*46.41*/.HomeController.FAQ),format.raw/*46.60*/("""">
                            <button type="button" class="btn btn-warning"> Cancel </button>
                        
                        </a>
                </div>
            """)))}),format.raw/*51.14*/("""   
        
  """),format.raw/*53.3*/("""<style>        
            .accordion """),format.raw/*54.24*/("""{"""),format.raw/*54.25*/("""
              """),format.raw/*55.15*/("""background-color: #eee;
              color: #444;
              cursor: pointer;
              padding: 18px;
              width: 80%;
              border: none;
              text-align: left;
              outline: none;
              font-size: 15px;
              transition: 0.4s;
            """),format.raw/*65.13*/("""}"""),format.raw/*65.14*/("""
            
            """),format.raw/*67.13*/(""".active, .accordion:hover """),format.raw/*67.39*/("""{"""),format.raw/*67.40*/("""
              """),format.raw/*68.15*/("""background-color: #ccc;
            """),format.raw/*69.13*/("""}"""),format.raw/*69.14*/("""
            
            """),format.raw/*71.13*/(""".panel """),format.raw/*71.20*/("""{"""),format.raw/*71.21*/("""
              """),format.raw/*72.15*/("""padding: 0 18px;
              background-color: white;
              max-height: 0;
              overflow: hidden;
              transition: max-height 0.2s ease-out;
            """),format.raw/*77.13*/("""}"""),format.raw/*77.14*/("""				
				"""),format.raw/*78.5*/("""</style>
							<div>

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
    
    for (i = 0; i < acc.length; i++) """),format.raw/*109.38*/("""{"""),format.raw/*109.39*/("""
      """),format.raw/*110.7*/("""acc[i].addEventListener("click", function() """),format.raw/*110.51*/("""{"""),format.raw/*110.52*/("""
        """),format.raw/*111.9*/("""this.classList.toggle("active");
        var panel = this.nextElementSibling;
        if (panel.style.maxHeight)"""),format.raw/*113.35*/("""{"""),format.raw/*113.36*/("""
          """),format.raw/*114.11*/("""panel.style.maxHeight = null;
        """),format.raw/*115.9*/("""}"""),format.raw/*115.10*/(""" """),format.raw/*115.11*/("""else """),format.raw/*115.16*/("""{"""),format.raw/*115.17*/("""
          """),format.raw/*116.11*/("""panel.style.maxHeight = panel.scrollHeight + "px";
        """),format.raw/*117.9*/("""}"""),format.raw/*117.10*/(""" 
      """),format.raw/*118.7*/("""}"""),format.raw/*118.8*/(""");
    """),format.raw/*119.5*/("""}"""),format.raw/*119.6*/("""
    """),format.raw/*120.5*/("""</script>



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

    """)))}),format.raw/*138.6*/("""
			"""),format.raw/*139.4*/("""<footer>
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
                  DATE: Mon Apr 23 16:56:32 IST 2018
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/FAQ.scala.html
                  HASH: 2c5ac89d53ad7f3942b34d0f4b95439115bf3ff1
                  MATRIX: 979->1|1115->66|1160->64|1187->83|1214->84|1308->153|1335->172|1374->174|1405->178|2054->800|2164->900|2204->901|2249->946|2295->1053|2340->1071|2353->1075|2384->1085|2447->1121|2544->1197|2589->1215|2688->1293|2733->1311|2839->1395|2942->1470|3119->1620|3134->1626|3174->1645|3390->1830|3432->1845|3499->1884|3528->1885|3571->1900|3900->2201|3929->2202|3983->2228|4037->2254|4066->2255|4109->2270|4173->2306|4202->2307|4256->2333|4291->2340|4320->2341|4363->2356|4572->2537|4601->2538|4637->2547|6052->3933|6082->3934|6117->3941|6190->3985|6220->3986|6257->3995|6398->4107|6428->4108|6468->4119|6534->4157|6564->4158|6594->4159|6628->4164|6658->4165|6698->4176|6785->4235|6815->4236|6851->4244|6880->4245|6915->4252|6944->4253|6977->4258|7544->4794|7576->4798
                  LINES: 28->1|31->2|34->1|35->3|36->4|41->9|41->9|41->9|42->10|62->30|62->30|62->30|63->31|64->32|65->33|65->33|65->33|68->36|68->36|69->37|69->37|70->38|70->38|76->44|78->46|78->46|78->46|83->51|85->53|86->54|86->54|87->55|97->65|97->65|99->67|99->67|99->67|100->68|101->69|101->69|103->71|103->71|103->71|104->72|109->77|109->77|110->78|141->109|141->109|142->110|142->110|142->110|143->111|145->113|145->113|146->114|147->115|147->115|147->115|147->115|147->115|148->116|149->117|149->117|150->118|150->118|151->119|151->119|152->120|170->138|171->139
                  -- GENERATED --
              */
          