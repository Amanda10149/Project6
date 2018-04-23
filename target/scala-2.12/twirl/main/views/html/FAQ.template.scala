
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
<style>
    .accordion """),format.raw/*57.16*/("""{"""),format.raw/*57.17*/("""
        """),format.raw/*58.9*/("""background-color: #eee;
        color: #444;
        cursor: pointer;
        padding: 18px;
        width: 100%;
        border: none;
        text-align: left;
        outline: none;
        font-size: 15px;
        transition: 0.4s;
    """),format.raw/*68.5*/("""}"""),format.raw/*68.6*/("""
    
    """),format.raw/*70.5*/(""".active, .accordion:hover """),format.raw/*70.31*/("""{"""),format.raw/*70.32*/("""
        """),format.raw/*71.9*/("""background-color: #ccc;
    """),format.raw/*72.5*/("""}"""),format.raw/*72.6*/("""
    
    """),format.raw/*74.5*/(""".panel """),format.raw/*74.12*/("""{"""),format.raw/*74.13*/("""
        """),format.raw/*75.9*/("""padding: 0 18px;
        background-color: white;
        max-height: 0;
        overflow: hidden;
        transition: max-height 0.2s ease-out;
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/("""
    """),format.raw/*81.5*/("""</style>
    </head>
    <body>
    
    <h2>Animated Accordion</h2>
    <p>Click on the buttons to open the collapsible content.</p>
    
    <button class="accordion">Section 1</button>
    <div class="panel">
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    </div>
    
    <button class="accordion">Section 2</button>
    <div class="panel">
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    </div>
    
    <button class="accordion">Section 3</button>
    <div class="panel">
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
    </div>
    
    <script>
    var acc = document.getElementsByClassName("accordion");
    var i;
    
    for (i = 0; i < acc.length; i++) """),format.raw/*107.38*/("""{"""),format.raw/*107.39*/("""
      """),format.raw/*108.7*/("""acc[i].addEventListener("click", function() """),format.raw/*108.51*/("""{"""),format.raw/*108.52*/("""
        """),format.raw/*109.9*/("""this.classList.toggle("active");
        var panel = this.nextElementSibling;
        if (panel.style.maxHeight)"""),format.raw/*111.35*/("""{"""),format.raw/*111.36*/("""
          """),format.raw/*112.11*/("""panel.style.maxHeight = null;
        """),format.raw/*113.9*/("""}"""),format.raw/*113.10*/(""" """),format.raw/*113.11*/("""else """),format.raw/*113.16*/("""{"""),format.raw/*113.17*/("""
          """),format.raw/*114.11*/("""panel.style.maxHeight = panel.scrollHeight + "px";
        """),format.raw/*115.9*/("""}"""),format.raw/*115.10*/(""" 
      """),format.raw/*116.7*/("""}"""),format.raw/*116.8*/(""");
    """),format.raw/*117.5*/("""}"""),format.raw/*117.6*/("""
    """),format.raw/*118.5*/("""</script>



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

    """)))}),format.raw/*136.6*/("""
			"""),format.raw/*137.4*/("""<footer>
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
                  DATE: Mon Apr 23 14:49:16 IST 2018
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/FAQ.scala.html
                  HASH: 46f6d8b23dcff2b770cafc95fad66edc337f0698
                  MATRIX: 979->1|1115->66|1160->64|1187->83|1214->84|1308->153|1335->172|1374->174|1405->178|1920->666|1955->692|1995->694|2036->707|2120->764|2230->864|2270->865|2315->910|2361->1017|2406->1035|2419->1039|2450->1049|2513->1085|2610->1161|2655->1179|2754->1257|2799->1275|2905->1359|3009->1435|3182->1581|3197->1587|3237->1606|3453->1791|3497->1804|3547->1827|3683->1935|3712->1936|3748->1945|4015->2185|4043->2186|4080->2196|4134->2222|4163->2223|4199->2232|4254->2260|4282->2261|4319->2271|4354->2278|4383->2279|4419->2288|4595->2437|4623->2438|4655->2443|5954->3713|5984->3714|6019->3721|6092->3765|6122->3766|6159->3775|6300->3887|6330->3888|6370->3899|6436->3937|6466->3938|6496->3939|6530->3944|6560->3945|6600->3956|6687->4015|6717->4016|6753->4024|6782->4025|6817->4032|6846->4033|6879->4038|7446->4574|7478->4578
                  LINES: 28->1|31->2|34->1|35->3|36->4|41->9|41->9|41->9|42->10|56->24|56->24|56->24|57->25|59->27|59->27|59->27|60->28|61->29|62->30|62->30|62->30|65->33|65->33|66->34|66->34|67->35|67->35|73->41|75->43|75->43|75->43|80->48|81->49|84->52|89->57|89->57|90->58|100->68|100->68|102->70|102->70|102->70|103->71|104->72|104->72|106->74|106->74|106->74|107->75|112->80|112->80|113->81|139->107|139->107|140->108|140->108|140->108|141->109|143->111|143->111|144->112|145->113|145->113|145->113|145->113|145->113|146->114|147->115|147->115|148->116|148->116|149->117|149->117|150->118|168->136|169->137
                  -- GENERATED --
              */
          