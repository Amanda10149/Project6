
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

object Phones extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
		
		<meta charset="UTF-8">
		<title>Computer Hub</title>
		"""),_display_(/*8.4*/main("Login", user)/*8.23*/ {_display_(Seq[Any](format.raw/*8.25*/("""
			
			"""),format.raw/*10.4*/("""<main>
<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">iPhone X</div>
        <div class="panel-body"><img src="/assets/images/iphoneX.jpg" alt="iPhoneX img" class="iPhoneX" style="width:128px;height:128px;" style="height: 13em"></div>
        """),_display_(/*17.10*/for(p <-products) yield /*17.27*/ {_display_(Seq[Any](format.raw/*17.29*/("""
          """),_display_(/*18.12*/if(p.getId == 2)/*18.28*/ {_display_(Seq[Any](format.raw/*18.30*/("""
          """),format.raw/*19.11*/("""<h4>"""),_display_(/*19.16*/p/*19.17*/.getName),format.raw/*19.25*/(""" """),format.raw/*19.26*/("""</h4>
          <ul>	
            <li>"""),_display_(/*21.18*/p/*21.19*/.getDescription),format.raw/*21.34*/("""</li><br>
            <li>"""),_display_(/*22.18*/p/*22.19*/.getStock),format.raw/*22.28*/("""</li><br>
            <li>euro; """),_display_(/*23.24*/("%.2f".format(p.getPrice))),format.raw/*23.51*/("""</li><br>
            <td>
              <a href=""""),_display_(/*25.25*/routes/*25.31*/.HomeController.deleteProduct(p.getId)),format.raw/*25.69*/("""" class="button-xs btn-danger">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
              """)))}),format.raw/*29.16*/("""   
          """),format.raw/*30.11*/("""</ul>
      """)))}),format.raw/*31.8*/("""   
      """),format.raw/*32.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">iPhone 7</div>
        <div class="panel-body"><img src="/assets/images/iphone7.jpg" alt="32' LG TV" class="productImg" style="width:128px;height:128px;" style="height: 13em"></div>
        """),_display_(/*38.10*/for(p <-products) yield /*38.27*/ {_display_(Seq[Any](format.raw/*38.29*/("""
          """),_display_(/*39.12*/if(p.getId == 8)/*39.28*/ {_display_(Seq[Any](format.raw/*39.30*/("""
        """),format.raw/*40.9*/("""<h4>"""),_display_(/*40.14*/p/*40.15*/.getName),format.raw/*40.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*42.16*/p/*42.17*/.getDescription),format.raw/*42.32*/("""  """),format.raw/*42.34*/("""</li><br>
          <li>"""),_display_(/*43.16*/p/*43.17*/.getStock),format.raw/*43.26*/("""</li><br>
          <li>euro; """),_display_(/*44.22*/("%.2f".format(p.getPrice))),format.raw/*44.49*/("""</li><br>
          <td>
            <a href=""""),_display_(/*46.23*/routes/*46.29*/.HomeController.deleteProduct(p.getId)),format.raw/*46.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*51.14*/("""
        """),format.raw/*52.9*/("""</ul>
      """)))}),format.raw/*53.8*/("""
      """),format.raw/*54.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">iPhone 6</div>
        <div class="panel-body"><img src="/assets/images/iphone6.jpg" alt="32' LG TV" class="productImg" style="width:128px;height:128px;" style="height: 13em"></div>
        """),_display_(/*60.10*/for(p <-products) yield /*60.27*/ {_display_(Seq[Any](format.raw/*60.29*/("""
          """),_display_(/*61.12*/if(p.getId == 5)/*61.28*/ {_display_(Seq[Any](format.raw/*61.30*/("""
        """),format.raw/*62.9*/("""<h4>"""),_display_(/*62.14*/p/*62.15*/.getName),format.raw/*62.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*64.16*/p/*64.17*/.getDescription),format.raw/*64.32*/("""</li><br>
        
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
      """)))}),format.raw/*76.8*/("""
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
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/Phones.scala.html
                  HASH: 87c16747daf11b1c7fb50a88fed46a217d0ddd6d
                  MATRIX: 981->1|1133->58|1161->60|1262->136|1289->155|1328->157|1363->165|1737->512|1770->529|1810->531|1849->543|1874->559|1914->561|1953->572|1985->577|1995->578|2024->586|2053->587|2119->626|2129->627|2165->642|2219->669|2229->670|2259->679|2319->712|2367->739|2445->790|2460->796|2519->834|2698->982|2740->996|2783->1009|2820->1019|3158->1330|3191->1347|3231->1349|3270->1361|3295->1377|3335->1379|3371->1388|3403->1393|3413->1394|3442->1402|3504->1437|3514->1438|3550->1453|3580->1455|3632->1480|3642->1481|3672->1490|3730->1521|3778->1548|3852->1595|3867->1601|3926->1639|4108->1790|4144->1799|4187->1812|4221->1819|4560->2131|4593->2148|4633->2150|4672->2162|4697->2178|4737->2180|4773->2189|4805->2194|4815->2195|4844->2203|4906->2238|4916->2239|4952->2254|5013->2288|5023->2289|5053->2298|5111->2329|5159->2356|5233->2403|5248->2409|5307->2447|5474->2583|5519->2597|5555->2606|5598->2619|5632->2626
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|57->25|57->25|57->25|61->29|62->30|63->31|64->32|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|74->42|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|78->46|78->46|78->46|83->51|84->52|85->53|86->54|92->60|92->60|92->60|93->61|93->61|93->61|94->62|94->62|94->62|94->62|96->64|96->64|96->64|98->66|98->66|98->66|99->67|99->67|101->69|101->69|101->69|105->73|106->74|107->75|108->76|109->77
                  -- GENERATED --
              */
          