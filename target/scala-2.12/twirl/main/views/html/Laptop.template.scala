
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

object Laptop extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""



"""),format.raw/*5.1*/("""<html>

<head>

	<meta charset="UTF-8">
	<title>Computer Hub</title>
	"""),_display_(/*11.3*/main("Login", user)/*11.22*/ {_display_(Seq[Any](format.raw/*11.24*/("""


	"""),format.raw/*14.2*/("""<main>
		<div class="container">    
			<div class="row">
			  <div class="col-sm-4">
				<div class="panel panel-primary">
				  <div class="panel-heading">Dell</div>
				  <div class="panel-body"><img src="/assets/images/dell-xps.jpg" alt="Alienware" class="productImg" style="height: 13em"></div>
				  """),_display_(/*21.8*/for(p <-products) yield /*21.25*/ {_display_(Seq[Any](format.raw/*21.27*/("""
					"""),_display_(/*22.7*/if(p.getId == 1)/*22.23*/ {_display_(Seq[Any](format.raw/*22.25*/("""
				  """),format.raw/*23.7*/("""<h4>"""),_display_(/*23.12*/p/*23.13*/.getName),format.raw/*23.21*/("""</h4>
				  <ul>	
					<li>"""),_display_(/*25.11*/p/*25.12*/.getDescription),format.raw/*25.27*/("""</li><br>
					<li>"""),_display_(/*26.11*/p/*26.12*/.getStock),format.raw/*26.21*/("""</li><br>
					<li>euro; """),_display_(/*27.17*/("%.2f".format(p.getPrice))),format.raw/*27.44*/("""</li><br>
					<td>
						<a href=""""),_display_(/*29.17*/routes/*29.23*/.HomeController.updateProduct(p.getId)),format.raw/*29.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon glyphicon-pencil"></span>
					</td>
					<td>
						<a href=""""),_display_(/*33.17*/routes/*33.23*/.HomeController.deleteProduct(p.getId)),format.raw/*33.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon glyphicon-trash"></span>
						</a>
					</td>
					
					  """)))}),format.raw/*38.9*/("""
				  """),format.raw/*39.7*/("""</ul>
					""")))}),format.raw/*40.7*/("""
				"""),format.raw/*41.5*/("""</div>
			  </div>
			  <div class="col-sm-4"> 
				<div class="panel panel-danger">
				  <div class="panel-heading">Alienware</div>
				  <div class="panel-body"><img src="/public/images/Alienware.png" alt="Alienware" class="productImg" style="height: 13em"></div>
				  """),_display_(/*47.8*/for(p <-products) yield /*47.25*/ {_display_(Seq[Any](format.raw/*47.27*/("""
					"""),_display_(/*48.7*/if(p.getId == 7)/*48.23*/ {_display_(Seq[Any](format.raw/*48.25*/("""
				  """),format.raw/*49.7*/("""<h4>"""),_display_(/*49.12*/p/*49.13*/.getName),format.raw/*49.21*/("""</h4>
				  <ul>	
					<li>"""),_display_(/*51.11*/p/*51.12*/.getDescription),format.raw/*51.27*/("""</li><br>
					<li>"""),_display_(/*52.11*/p/*52.12*/.getStock),format.raw/*52.21*/("""</li><br>
					<li>euro; """),_display_(/*53.17*/("%.2f".format(p.getPrice))),format.raw/*53.44*/("""</li><br>
					<td>
							<a href=""""),_display_(/*55.18*/routes/*55.24*/.HomeController.updateProduct(p.getId)),format.raw/*55.62*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
						</td>
					<td>
						<a href=""""),_display_(/*59.17*/routes/*59.23*/.HomeController.deleteProduct(p.getId)),format.raw/*59.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon glyphicon-trash"></span>
						</a>
					</td>
					
					  """)))}),format.raw/*64.9*/("""
				  """),format.raw/*65.7*/("""</ul>
					""")))}),format.raw/*66.7*/("""
				"""),format.raw/*67.5*/("""</div>
			  </div>
			  <div class="col-sm-4"> 
				<div class="panel panel-success">
				  <div class="panel-heading">Inspirion</div>
				  <div class="panel-body"><img src="/assets/images/Inspiron.jpg" alt="Inspiron" class="productImg" style="height: 13em;"></div>
				  """),_display_(/*73.8*/for(p <-products) yield /*73.25*/ {_display_(Seq[Any](format.raw/*73.27*/("""
					"""),_display_(/*74.7*/if(p.getId == 4)/*74.23*/ {_display_(Seq[Any](format.raw/*74.25*/("""
				  """),format.raw/*75.7*/("""<h4>"""),_display_(/*75.12*/p/*75.13*/.getName),format.raw/*75.21*/("""</h4>
				  <ul>	
					<li>"""),_display_(/*77.11*/p/*77.12*/.getDescription),format.raw/*77.27*/("""</li><br>
					<li>"""),_display_(/*78.11*/p/*78.12*/.getStock),format.raw/*78.21*/("""</li><br>
					<li>euro; """),_display_(/*79.17*/("%.2f".format(p.getPrice))),format.raw/*79.44*/("""</li><br>
					<td>
							<a href=""""),_display_(/*81.18*/routes/*81.24*/.HomeController.updateProduct(p.getId)),format.raw/*81.62*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
						</td>
					<td>
						<a href=""""),_display_(/*85.17*/routes/*85.23*/.HomeController.deleteProduct(p.getId)),format.raw/*85.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon glyphicon-trash"></span>
						</a>
					</td>
				""")))}),format.raw/*89.6*/("""
					  """)))}),format.raw/*90.9*/("""
				  """),format.raw/*91.7*/("""</ul>
					""")))}),format.raw/*92.7*/("""
				"""),format.raw/*93.5*/("""</div>
			  </div>
			</div>
			</div>
			<p>
				<a href=""""),_display_(/*98.15*/routes/*98.21*/.HomeController.addProduct()),format.raw/*98.49*/("""">
					<button class="btn btn-primary">Add a product</button>
				</a>
			</p>
					  </main>
						  
					  <footer>
						  Copyright &copy; 2018
					  </footer>
				  </div>
			  </body>
		  </html>"""))
      }
    }
  }

  def render(products:List[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,user)

  def f:((List[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,user) => apply(products,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 16:48:53 IST 2018
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/Laptop.scala.html
                  HASH: 7cf65d9436809b954b6a40e7ae4b561eeb6df9ed
                  MATRIX: 981->1|1133->58|1163->62|1260->133|1288->152|1328->154|1359->158|1692->465|1725->482|1765->484|1798->491|1823->507|1863->509|1897->516|1929->521|1939->522|1968->530|2023->558|2033->559|2069->574|2116->594|2126->595|2156->604|2209->630|2257->657|2320->693|2335->699|2394->737|2546->862|2561->868|2620->906|2773->1029|2807->1036|2849->1048|2881->1053|3181->1327|3214->1344|3254->1346|3287->1353|3312->1369|3352->1371|3386->1378|3418->1383|3428->1384|3457->1392|3512->1420|3522->1421|3558->1436|3605->1456|3615->1457|3645->1466|3698->1492|3746->1519|3810->1556|3825->1562|3884->1600|4038->1727|4053->1733|4112->1771|4265->1894|4299->1901|4341->1913|4373->1918|4673->2192|4706->2209|4746->2211|4779->2218|4804->2234|4844->2236|4878->2243|4910->2248|4920->2249|4949->2257|5004->2285|5014->2286|5050->2301|5097->2321|5107->2322|5137->2331|5190->2357|5238->2384|5302->2421|5317->2427|5376->2465|5530->2592|5545->2598|5604->2636|5748->2750|5787->2759|5821->2766|5863->2778|5895->2783|5982->2843|5997->2849|6046->2877
                  LINES: 28->1|33->1|37->5|43->11|43->11|43->11|46->14|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|55->23|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|61->29|61->29|61->29|65->33|65->33|65->33|70->38|71->39|72->40|73->41|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|81->49|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|87->55|87->55|87->55|91->59|91->59|91->59|96->64|97->65|98->66|99->67|105->73|105->73|105->73|106->74|106->74|106->74|107->75|107->75|107->75|107->75|109->77|109->77|109->77|110->78|110->78|110->78|111->79|111->79|113->81|113->81|113->81|117->85|117->85|117->85|121->89|122->90|123->91|124->92|125->93|130->98|130->98|130->98
                  -- GENERATED --
              */
          