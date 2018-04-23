
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
						<a href=""""),_display_(/*29.17*/routes/*29.23*/.HomeController.deleteProduct(p.getId)),format.raw/*29.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon glyphicon-trash"></span>
						</a>
					</td>
					
					  """)))}),format.raw/*34.9*/("""
				  """),format.raw/*35.7*/("""</ul>
					""")))}),format.raw/*36.7*/("""
				"""),format.raw/*37.5*/("""</div>
			  </div>
			  <div class="col-sm-4"> 
				<div class="panel panel-danger">
				  <div class="panel-heading">Alienware</div>
				  <div class="panel-body"><img src="/assets/images/Alienware.png" alt="Alienware" class="productImg" style="height: 13em"></div>
				  """),_display_(/*43.8*/for(p <-products) yield /*43.25*/ {_display_(Seq[Any](format.raw/*43.27*/("""
					"""),_display_(/*44.7*/if(p.getId == 7)/*44.23*/ {_display_(Seq[Any](format.raw/*44.25*/("""
				  """),format.raw/*45.7*/("""<h4>"""),_display_(/*45.12*/p/*45.13*/.getName),format.raw/*45.21*/("""</h4>
				  <ul>	
					<li>"""),_display_(/*47.11*/p/*47.12*/.getDescription),format.raw/*47.27*/("""</li><br>
					<li>"""),_display_(/*48.11*/p/*48.12*/.getStock),format.raw/*48.21*/("""</li><br>
					<li>euro; """),_display_(/*49.17*/("%.2f".format(p.getPrice))),format.raw/*49.44*/("""</li><br>
					<td>
						<a href=""""),_display_(/*51.17*/routes/*51.23*/.HomeController.deleteProduct(p.getId)),format.raw/*51.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon glyphicon-trash"></span>
						</a>
					</td>
					
					  """)))}),format.raw/*56.9*/("""
				  """),format.raw/*57.7*/("""</ul>
					""")))}),format.raw/*58.7*/("""
				"""),format.raw/*59.5*/("""</div>
			  </div>
			  <div class="col-sm-4"> 
				<div class="panel panel-success">
				  <div class="panel-heading">Inspirion</div>
				  <div class="panel-body"><img src="/assets/images/Inspiron.jpg" alt="Inspiron" class="productImg" style="height: 13em;"></div>
				  """),_display_(/*65.8*/for(p <-products) yield /*65.25*/ {_display_(Seq[Any](format.raw/*65.27*/("""
					"""),_display_(/*66.7*/if(p.getId == 4)/*66.23*/ {_display_(Seq[Any](format.raw/*66.25*/("""
				  """),format.raw/*67.7*/("""<h4>"""),_display_(/*67.12*/p/*67.13*/.getName),format.raw/*67.21*/("""</h4>
				  <ul>	
					<li>"""),_display_(/*69.11*/p/*69.12*/.getDescription),format.raw/*69.27*/("""</li><br>
					<li>"""),_display_(/*70.11*/p/*70.12*/.getStock),format.raw/*70.21*/("""</li><br>
					<li>euro; """),_display_(/*71.17*/("%.2f".format(p.getPrice))),format.raw/*71.44*/("""</li><br>
					<td>
						<a href=""""),_display_(/*73.17*/routes/*73.23*/.HomeController.deleteProduct(p.getId)),format.raw/*73.61*/("""" class="button-xs btn-danger">
							<span class="glyphicon glyphicon-trash"></span>
						</a>
					</td>
				""")))}),format.raw/*77.6*/("""
					  """)))}),format.raw/*78.9*/("""
				  """),format.raw/*79.7*/("""</ul>
					""")))}),format.raw/*80.7*/("""
				"""),format.raw/*81.5*/("""</div>
			  </div>
			</div>
			</div>
			<p>
				<a href=""""),_display_(/*86.15*/routes/*86.21*/.HomeController.addProduct()),format.raw/*86.49*/("""">
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
                  DATE: Mon Apr 23 14:01:52 IST 2018
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/Laptop.scala.html
                  HASH: e0d4be8605746f0fdde375a468bf2bcec0badf50
                  MATRIX: 981->1|1133->58|1163->62|1260->133|1288->152|1328->154|1359->158|1692->465|1725->482|1765->484|1798->491|1823->507|1863->509|1897->516|1929->521|1939->522|1968->530|2023->558|2033->559|2069->574|2116->594|2126->595|2156->604|2209->630|2257->657|2320->693|2335->699|2394->737|2547->860|2581->867|2623->879|2655->884|2955->1158|2988->1175|3028->1177|3061->1184|3086->1200|3126->1202|3160->1209|3192->1214|3202->1215|3231->1223|3286->1251|3296->1252|3332->1267|3379->1287|3389->1288|3419->1297|3472->1323|3520->1350|3583->1386|3598->1392|3657->1430|3810->1553|3844->1560|3886->1572|3918->1577|4218->1851|4251->1868|4291->1870|4324->1877|4349->1893|4389->1895|4423->1902|4455->1907|4465->1908|4494->1916|4549->1944|4559->1945|4595->1960|4642->1980|4652->1981|4682->1990|4735->2016|4783->2043|4846->2079|4861->2085|4920->2123|5064->2237|5103->2246|5137->2253|5179->2265|5211->2270|5298->2330|5313->2336|5362->2364
                  LINES: 28->1|33->1|37->5|43->11|43->11|43->11|46->14|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|55->23|57->25|57->25|57->25|58->26|58->26|58->26|59->27|59->27|61->29|61->29|61->29|66->34|67->35|68->36|69->37|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|83->51|83->51|83->51|88->56|89->57|90->58|91->59|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|99->67|101->69|101->69|101->69|102->70|102->70|102->70|103->71|103->71|105->73|105->73|105->73|109->77|110->78|111->79|112->80|113->81|118->86|118->86|118->86
                  -- GENERATED --
              */
          