
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
          <li>"""),_display_(/*23.16*/p/*23.17*/.getPrice),format.raw/*23.26*/("""</li><br>
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
          <li>"""),_display_(/*45.16*/p/*45.17*/.getPrice),format.raw/*45.26*/("""</li><br>
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
          <li>"""),_display_(/*67.16*/p/*67.17*/.getPrice),format.raw/*67.26*/("""</li><br>
          <td>
            <a href=""""),_display_(/*69.23*/routes/*69.29*/.HomeController.deleteProduct(p.getId)),format.raw/*69.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon glyphicon-remove-sign"></span>
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
                  DATE: Mon Apr 23 13:04:20 IST 2018
                  SOURCE: /home/wdd/Downloads/Project5-master/app/views/tv.scala.html
                  HASH: 66f992b8c8fdd95e7faadcf5f0ba4b0d2a68752a
                  MATRIX: 977->1|1129->58|1157->60|1260->138|1287->157|1326->159|1361->167|1727->506|1760->523|1800->525|1839->537|1864->553|1904->555|1940->564|1972->569|1982->570|2011->578|2073->613|2083->614|2119->629|2171->654|2181->655|2211->664|2263->689|2273->690|2303->699|2377->746|2392->752|2451->790|2633->941|2669->950|2717->967|2751->974|3085->1281|3118->1298|3158->1300|3197->1312|3223->1329|3263->1331|3299->1340|3331->1345|3341->1346|3370->1354|3432->1389|3442->1390|3478->1405|3530->1430|3540->1431|3570->1440|3622->1465|3632->1466|3662->1475|3736->1522|3751->1528|3810->1566|3992->1717|4028->1726|4076->1743|4110->1750|4452->2065|4485->2082|4525->2084|4564->2096|4589->2112|4629->2114|4665->2123|4697->2128|4707->2129|4736->2137|4798->2172|4808->2173|4844->2188|4896->2213|4906->2214|4936->2223|4988->2248|4998->2249|5028->2258|5102->2305|5117->2311|5176->2349|5349->2491|5394->2505|5430->2514|5478->2531|5512->2538
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|57->25|57->25|57->25|62->30|63->31|64->32|65->33|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|73->41|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|79->47|79->47|79->47|84->52|85->53|86->54|87->55|93->61|93->61|93->61|94->62|94->62|94->62|95->63|95->63|95->63|95->63|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|101->69|101->69|101->69|105->73|106->74|107->75|108->76|109->77
                  -- GENERATED --
              */
          