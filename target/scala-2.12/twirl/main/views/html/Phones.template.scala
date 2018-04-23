
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
            <li>"""),_display_(/*23.18*/p/*23.19*/.getPrice),format.raw/*23.28*/("""</li><br>
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
          <li>"""),_display_(/*44.16*/p/*44.17*/.getPrice),format.raw/*44.26*/("""</li><br>
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
          <li>"""),_display_(/*67.16*/p/*67.17*/.getPrice),format.raw/*67.26*/("""</li><br>
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
                  DATE: Mon Apr 23 13:04:20 IST 2018
                  SOURCE: /home/wdd/Downloads/Project5-master/app/views/Phones.scala.html
                  HASH: a735f9d4082c343999deb63f0c8aa300ffbc94b3
                  MATRIX: 981->1|1133->58|1161->60|1262->136|1289->155|1328->157|1363->165|1737->512|1770->529|1810->531|1849->543|1874->559|1914->561|1953->572|1985->577|1995->578|2024->586|2053->587|2119->626|2129->627|2165->642|2219->669|2229->670|2259->679|2313->706|2323->707|2353->716|2431->767|2446->773|2505->811|2684->959|2726->973|2769->986|2806->996|3144->1307|3177->1324|3217->1326|3256->1338|3281->1354|3321->1356|3357->1365|3389->1370|3399->1371|3428->1379|3490->1414|3500->1415|3536->1430|3566->1432|3618->1457|3628->1458|3658->1467|3710->1492|3720->1493|3750->1502|3824->1549|3839->1555|3898->1593|4080->1744|4116->1753|4159->1766|4193->1773|4532->2085|4565->2102|4605->2104|4644->2116|4669->2132|4709->2134|4745->2143|4777->2148|4787->2149|4816->2157|4878->2192|4888->2193|4924->2208|4985->2242|4995->2243|5025->2252|5077->2277|5087->2278|5117->2287|5191->2334|5206->2340|5265->2378|5432->2514|5477->2528|5513->2537|5556->2550|5590->2557
                  LINES: 28->1|33->1|35->3|40->8|40->8|40->8|42->10|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|57->25|57->25|57->25|61->29|62->30|63->31|64->32|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|74->42|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|78->46|78->46|78->46|83->51|84->52|85->53|86->54|92->60|92->60|92->60|93->61|93->61|93->61|94->62|94->62|94->62|94->62|96->64|96->64|96->64|98->66|98->66|98->66|99->67|99->67|99->67|101->69|101->69|101->69|105->73|106->74|107->75|108->76|109->77
                  -- GENERATED --
              */
          