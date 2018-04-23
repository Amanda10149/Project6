
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
            <a href=""""),_display_(/*25.23*/routes/*25.29*/.HomeController.deleteProduct(p.getId)),format.raw/*25.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*30.14*/("""
        """),format.raw/*31.9*/("""</ul>
          """)))}),format.raw/*32.12*/("""
      """),format.raw/*33.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">Samsung 40 Inch Full HD TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img2.jpg" alt="40' Samsung TV" class="productImg" style="height: 13em"></div>
        """),_display_(/*39.10*/for(p <-products) yield /*39.27*/ {_display_(Seq[Any](format.raw/*39.29*/("""
          """),_display_(/*40.12*/if(p.getId == 10)/*40.29*/ {_display_(Seq[Any](format.raw/*40.31*/("""
        """),format.raw/*41.9*/("""<h4>"""),_display_(/*41.14*/p/*41.15*/.getName),format.raw/*41.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*43.16*/p/*43.17*/.getDescription),format.raw/*43.32*/("""</li><br>
          <li>"""),_display_(/*44.16*/p/*44.17*/.getStock),format.raw/*44.26*/("""</li><br>
          <li>euro; """),_display_(/*45.22*/("%.2f".format(p.getPrice))),format.raw/*45.49*/("""</li><br>
          <td>
            <a href=""""),_display_(/*47.23*/routes/*47.29*/.HomeController.deleteProduct(p.getId)),format.raw/*47.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*52.14*/("""
        """),format.raw/*53.9*/("""</ul>
          """)))}),format.raw/*54.12*/("""
      """),format.raw/*55.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">Samsung 49 Inch Full HD Smart TV</div>
        <div class="panel-body"><img src="/assets/images/SamsungTV-img3.jpg" alt="49' Samsung TV" class="productImg" style="height: 13em;"></div>
        """),_display_(/*61.10*/for(p <-products) yield /*61.27*/ {_display_(Seq[Any](format.raw/*61.29*/("""
          """),_display_(/*62.12*/if(p.getId == 6)/*62.28*/ {_display_(Seq[Any](format.raw/*62.30*/("""
        """),format.raw/*63.9*/("""<h4>"""),_display_(/*63.14*/p/*63.15*/.getName),format.raw/*63.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*65.16*/p/*65.17*/.getDescription),format.raw/*65.32*/("""</li><br>
          <li>"""),_display_(/*66.16*/p/*66.17*/.getStock),format.raw/*66.26*/("""</li><br>
          <li>euro; """),_display_(/*67.22*/("%.2f".format(p.getPrice))),format.raw/*67.49*/("""</li><br>
          <td>
            <a href=""""),_display_(/*69.23*/routes/*69.29*/.HomeController.deleteProduct(p.getId)),format.raw/*69.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon glyphicon-trash"></span>
            </a>
          </td>
        """)))}),format.raw/*73.10*/("""
            """)))}),format.raw/*74.14*/("""
        """),format.raw/*75.9*/("""</ul>
          """)))}),format.raw/*76.12*/("""
      """),format.raw/*77.7*/("""</div>
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
                  DATE: Mon Apr 23 14:01:52 IST 2018
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/tv.scala.html
                  HASH: 48106c5e3552a47687a3dd68bc35c723b280e8b3
                  MATRIX: 977->1|1129->58|1157->60|1260->138|1287->157|1326->159|1361->167|1727->506|1760->523|1800->525|1839->537|1864->553|1904->555|1940->564|1972->569|1982->570|2011->578|2073->613|2083->614|2119->629|2171->654|2181->655|2211->664|2269->695|2317->722|2391->769|2406->775|2465->813|2647->964|2683->973|2731->990|2765->997|3099->1304|3132->1321|3172->1323|3211->1335|3237->1352|3277->1354|3313->1363|3345->1368|3355->1369|3384->1377|3446->1412|3456->1413|3492->1428|3544->1453|3554->1454|3584->1463|3642->1494|3690->1521|3764->1568|3779->1574|3838->1612|4020->1763|4056->1772|4104->1789|4138->1796|4480->2111|4513->2128|4553->2130|4592->2142|4617->2158|4657->2160|4693->2169|4725->2174|4735->2175|4764->2183|4826->2218|4836->2219|4872->2234|4924->2259|4934->2260|4964->2269|5022->2300|5070->2327|5144->2374|5159->2380|5218->2418|5385->2554|5430->2568|5466->2577|5514->2594|5548->2601
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|57->25|57->25|57->25|62->30|63->31|64->32|65->33|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|79->47|79->47|79->47|84->52|85->53|86->54|87->55|93->61|93->61|93->61|94->62|94->62|94->62|95->63|95->63|95->63|95->63|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|101->69|101->69|101->69|105->73|106->74|107->75|108->76|109->77
                  -- GENERATED --
              */
          