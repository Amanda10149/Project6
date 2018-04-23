
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
                <a href=""""),_display_(/*25.27*/routes/*25.33*/.HomeController.updateProduct(p.getId)),format.raw/*25.71*/("""" class="button-xs btn-danger">
                  <span class="glyphicon glyphicon-pencil"></span>
              </td>
            <td>
              <a href=""""),_display_(/*29.25*/routes/*29.31*/.HomeController.deleteProduct(p.getId)),format.raw/*29.69*/("""" class="button-xs btn-danger">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
              """)))}),format.raw/*33.16*/("""   
          """),format.raw/*34.11*/("""</ul>
      """)))}),format.raw/*35.8*/("""   
      """),format.raw/*36.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">iPhone 7</div>
        <div class="panel-body"><img src="/assets/images/iphone7.jpg" alt="32' LG TV" class="productImg" style="width:128px;height:128px;" style="height: 13em"></div>
        """),_display_(/*42.10*/for(p <-products) yield /*42.27*/ {_display_(Seq[Any](format.raw/*42.29*/("""
          """),_display_(/*43.12*/if(p.getId == 8)/*43.28*/ {_display_(Seq[Any](format.raw/*43.30*/("""
        """),format.raw/*44.9*/("""<h4>"""),_display_(/*44.14*/p/*44.15*/.getName),format.raw/*44.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*46.16*/p/*46.17*/.getDescription),format.raw/*46.32*/("""  """),format.raw/*46.34*/("""</li><br>
          <li>"""),_display_(/*47.16*/p/*47.17*/.getStock),format.raw/*47.26*/("""</li><br>
          <li>euro; """),_display_(/*48.22*/("%.2f".format(p.getPrice))),format.raw/*48.49*/("""</li><br>
          <td>
							<a href=""""),_display_(/*50.18*/routes/*50.24*/.HomeController.updateProduct(p.getId)),format.raw/*50.62*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
						</td>
          <td>
            <a href=""""),_display_(/*54.23*/routes/*54.29*/.HomeController.deleteProduct(p.getId)),format.raw/*54.67*/("""" class="button-xs btn-danger">
              <span class="glyphicon glyphicon-trash"></span>
            </a>
          </td>
          
            """)))}),format.raw/*59.14*/("""
        """),format.raw/*60.9*/("""</ul>
      """)))}),format.raw/*61.8*/("""
      """),format.raw/*62.7*/("""</div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">iPhone 6</div>
        <div class="panel-body"><img src="/assets/images/iphone6.jpg" alt="32' LG TV" class="productImg" style="width:128px;height:128px;" style="height: 13em"></div>
        """),_display_(/*68.10*/for(p <-products) yield /*68.27*/ {_display_(Seq[Any](format.raw/*68.29*/("""
          """),_display_(/*69.12*/if(p.getId == 5)/*69.28*/ {_display_(Seq[Any](format.raw/*69.30*/("""
        """),format.raw/*70.9*/("""<h4>"""),_display_(/*70.14*/p/*70.15*/.getName),format.raw/*70.23*/("""</h4>
        <ul>	
          <li>"""),_display_(/*72.16*/p/*72.17*/.getDescription),format.raw/*72.32*/("""</li><br>
        
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
      """)))}),format.raw/*88.8*/("""
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
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/Phones.scala.html
                  HASH: 2a93eeb62094eb594e0e991c909418444bb7d075
                  MATRIX: 981->1|1133->58|1161->60|1262->136|1289->155|1328->157|1363->165|1737->512|1770->529|1810->531|1849->543|1874->559|1914->561|1953->572|1985->577|1995->578|2024->586|2053->587|2119->626|2129->627|2165->642|2219->669|2229->670|2259->679|2319->712|2367->739|2447->792|2462->798|2521->836|2708->996|2723->1002|2782->1040|2961->1188|3003->1202|3046->1215|3083->1225|3421->1536|3454->1553|3494->1555|3533->1567|3558->1583|3598->1585|3634->1594|3666->1599|3676->1600|3705->1608|3767->1643|3777->1644|3813->1659|3843->1661|3895->1686|3905->1687|3935->1696|3993->1727|4041->1754|4110->1796|4125->1802|4184->1840|4349->1978|4364->1984|4423->2022|4605->2173|4641->2182|4684->2195|4718->2202|5057->2514|5090->2531|5130->2533|5169->2545|5194->2561|5234->2563|5270->2572|5302->2577|5312->2578|5341->2586|5403->2621|5413->2622|5449->2637|5510->2671|5520->2672|5550->2681|5608->2712|5656->2739|5725->2781|5740->2787|5799->2825|5964->2963|5979->2969|6038->3007|6205->3143|6250->3157|6286->3166|6329->3179|6363->3186
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|57->25|57->25|57->25|61->29|61->29|61->29|65->33|66->34|67->35|68->36|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|76->44|78->46|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|82->50|82->50|82->50|86->54|86->54|86->54|91->59|92->60|93->61|94->62|100->68|100->68|100->68|101->69|101->69|101->69|102->70|102->70|102->70|102->70|104->72|104->72|104->72|106->74|106->74|106->74|107->75|107->75|109->77|109->77|109->77|113->81|113->81|113->81|117->85|118->86|119->87|120->88|121->89
                  -- GENERATED --
              */
          