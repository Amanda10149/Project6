
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

object tv extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>Computer Hub</title>
    """),_display_(/*8.6*/main("Login", user)/*8.25*/ {_display_(Seq[Any](format.raw/*8.27*/("""
			
			"""),format.raw/*10.4*/("""<main>
<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">Samsung 24 inch HD TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img1.jpg" alt="24' Samsung TV" class="productImg" style="height: 13em"></div>
        """),_display_(/*17.10*/for(p <-products) yield /*17.27*/ {_display_(Seq[Any](format.raw/*17.29*/("""
          """),_display_(/*18.12*/if(p.getId == 9)/*18.28*/ {_display_(Seq[Any](format.raw/*18.30*/("""
        """),format.raw/*19.9*/("""<h4>"""),_display_(/*19.14*/p/*19.15*/.getName),format.raw/*19.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*21.16*/p/*21.17*/.getDescription),format.raw/*21.32*/("""</li><br>
          <li>"""),_display_(/*22.16*/p/*22.17*/.getStock),format.raw/*22.26*/("""</li><br>
          <li>euro; """),_display_(/*23.22*/("%.2f".format(p.getPrice))),format.raw/*23.49*/("""</li><br>
          <td>
							<a href=""""),_display_(/*25.18*/routes/*25.24*/.HomeController.updateProduct(p.getId)),format.raw/*25.62*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
						</td>
          <td>
            <a href=""""),_display_(/*29.23*/routes/*29.29*/.HomeController.deleteProduct(p.getId)),format.raw/*29.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*34.14*/("""
        """),format.raw/*35.9*/("""</ul>
          """)))}),format.raw/*36.12*/("""
      """),format.raw/*37.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Samsung 40 Inch Full HD TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img2.jpg" alt="40' Samsung TV" class="productImg" style="height: 13em"></div>
        """),_display_(/*43.10*/for(p <-products) yield /*43.27*/ {_display_(Seq[Any](format.raw/*43.29*/("""
          """),_display_(/*44.12*/if(p.getId == 10)/*44.29*/ {_display_(Seq[Any](format.raw/*44.31*/("""
        """),format.raw/*45.9*/("""<h4>"""),_display_(/*45.14*/p/*45.15*/.getName),format.raw/*45.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*47.16*/p/*47.17*/.getDescription),format.raw/*47.32*/("""</li><br>
          <li>"""),_display_(/*48.16*/p/*48.17*/.getStock),format.raw/*48.26*/("""</li><br>
          <li>euro; """),_display_(/*49.22*/("%.2f".format(p.getPrice))),format.raw/*49.49*/("""</li><br>
          <td>
							<a href=""""),_display_(/*51.18*/routes/*51.24*/.HomeController.updateProduct(p.getId)),format.raw/*51.62*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
						</td>
          <td>
            <a href=""""),_display_(/*55.23*/routes/*55.29*/.HomeController.deleteProduct(p.getId)),format.raw/*55.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*60.14*/("""
        """),format.raw/*61.9*/("""</ul>
          """)))}),format.raw/*62.12*/("""
      """),format.raw/*63.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Samsung 49 Inch Full HD Smart TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img3.jpg" alt="49' Samsung TV" class="productImg" style="height: 13em;"></div>
        """),_display_(/*69.10*/for(p <-products) yield /*69.27*/ {_display_(Seq[Any](format.raw/*69.29*/("""
          """),_display_(/*70.12*/if(p.getId == 6)/*70.28*/ {_display_(Seq[Any](format.raw/*70.30*/("""
        """),format.raw/*71.9*/("""<h4>"""),_display_(/*71.14*/p/*71.15*/.getName),format.raw/*71.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*73.16*/p/*73.17*/.getDescription),format.raw/*73.32*/("""</li><br>
          <li>"""),_display_(/*74.16*/p/*74.17*/.getStock),format.raw/*74.26*/("""</li><br>
          <li>euro; """),_display_(/*75.22*/("%.2f".format(p.getPrice))),format.raw/*75.49*/("""</li><br>
          <td>
							<a href=""""),_display_(/*77.18*/routes/*77.24*/.HomeController.updateProduct(p.getId)),format.raw/*77.62*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
						</td>
          <td>
            <a href=""""),_display_(/*81.23*/routes/*81.29*/.HomeController.deleteProduct(p.getId)),format.raw/*81.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon glyphicon-trash"></span>
            </a>
          </td>
        """)))}),format.raw/*85.10*/("""
            """)))}),format.raw/*86.14*/("""
        """),format.raw/*87.9*/("""</ul>
          """)))}),format.raw/*88.12*/("""
      """),format.raw/*89.7*/("""</div>
    </div>
  </div>
</div>

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
                  DATE: Mon Apr 23 14:49:16 IST 2018
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/tv.scala.html
                  HASH: 3e4652b4aef37bc901b4662c1fb819eaf6e263e4
                  MATRIX: 977->1|1129->58|1157->60|1260->138|1287->157|1326->159|1361->167|1727->506|1760->523|1800->525|1839->537|1864->553|1904->555|1940->564|1972->569|1982->570|2011->578|2073->613|2083->614|2119->629|2171->654|2181->655|2211->664|2269->695|2317->722|2386->764|2401->770|2460->808|2625->946|2640->952|2699->990|2881->1141|2917->1150|2965->1167|2999->1174|3333->1481|3366->1498|3406->1500|3445->1512|3471->1529|3511->1531|3547->1540|3579->1545|3589->1546|3618->1554|3680->1589|3690->1590|3726->1605|3778->1630|3788->1631|3818->1640|3876->1671|3924->1698|3993->1740|4008->1746|4067->1784|4232->1922|4247->1928|4306->1966|4488->2117|4524->2126|4572->2143|4606->2150|4948->2465|4981->2482|5021->2484|5060->2496|5085->2512|5125->2514|5161->2523|5193->2528|5203->2529|5232->2537|5294->2572|5304->2573|5340->2588|5392->2613|5402->2614|5432->2623|5490->2654|5538->2681|5607->2723|5622->2729|5681->2767|5846->2905|5861->2911|5920->2949|6087->3085|6132->3099|6168->3108|6216->3125|6250->3132
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|57->25|57->25|57->25|61->29|61->29|61->29|66->34|67->35|68->36|69->37|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|77->45|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|83->51|83->51|83->51|87->55|87->55|87->55|92->60|93->61|94->62|95->63|101->69|101->69|101->69|102->70|102->70|102->70|103->71|103->71|103->71|103->71|105->73|105->73|105->73|106->74|106->74|106->74|107->75|107->75|109->77|109->77|109->77|113->81|113->81|113->81|117->85|118->86|119->87|120->88|121->89
                  -- GENERATED --
              */
          