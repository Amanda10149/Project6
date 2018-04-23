
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.57*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="utf-8">

<title>Computer Hub - """),_display_(/*12.24*/title),format.raw/*12.29*/("""</title>

<!-- Bootstrap Core CSS -->
<link rel="stylesheet" type="text/css" href=""""),_display_(/*15.47*/routes/*15.53*/.Assets.versioned("stylesheets/myStyles.css")),format.raw/*15.98*/("""">
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>

<body>


        <div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>
    
            <!-- Wrapper for slides -->
            <div class="carousel-inner">
                <div class="item active">
                    <img src="/assets/images/sale.jpg" alt="Sale">
                </div>
    
    
                <div class="item">
                    <img src="/assets/images/tv.jpg" alt="TV">
                </div>
    
                <div class="item">
                    <img src="/assets/images/iphone.png" alt="iPhone">
                </div>
    
                <div class="item">
                    <img src="/assets/images/laptop.jpg" alt="Macbook">
                </div>
            </div>
    
            <!-- Left and right controls -->
            <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
              <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>                        
                </button>
                <a class="navbar-brand" href="/"><span class="glyphicon glyphicon-home"></a>
              </div>
              <div class="collapse navbar-collapse" id="myNavbar">
                <ul class="nav navbar-nav">
                     <li class="dropdown"><a href="/">Home</a></li>
                     <li class="dropdown"><a href="/tv">Televisions</a></li>
                     <li class="dropdown"><a href="/Phones">Phones</a></li>
                     <li class="dropdown"><a href="/Laptop">Laptops</a></li>
                     <li class="dropdown"><a href="/about">About Us</a></li>
                     <li class="dropdown"><a href="/FAQ">FAQ</a></li>
                     <li """),_display_(/*86.27*/if(title=="Login")/*86.45*/{_display_(Seq[Any](format.raw/*86.46*/("""class="active"""")))}),format.raw/*86.61*/(""">
                        """),_display_(/*87.26*/if(user != null)/*87.42*/ {_display_(Seq[Any](format.raw/*87.44*/("""
                            """),format.raw/*88.29*/("""<a href=""""),_display_(/*88.39*/routes/*88.45*/.LoginController.logout()),format.raw/*88.70*/("""">Logout """),_display_(/*88.80*/user/*88.84*/.getName()),format.raw/*88.94*/("""</a>
                        """)))}/*89.27*/else/*89.32*/{_display_(Seq[Any](format.raw/*89.33*/("""
                            """),format.raw/*90.29*/("""<a href=""""),_display_(/*90.39*/routes/*90.45*/.LoginController.login()),format.raw/*90.69*/("""">Login</a>
                        """)))}),format.raw/*91.26*/("""
                    """),format.raw/*92.21*/("""</li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                  <li><a href="/Login"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
                  <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
                </ul>
              </div>
            </div>
          </nav>
         
        </div>
        
        </nav>

<container>

<div class="row">

<div class="col-md-12">

"""),_display_(/*112.2*/content),format.raw/*112.9*/("""

"""),format.raw/*114.1*/("""</div>

</div>

</container>

</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 23 14:01:52 IST 2018
                  SOURCE: /home/wdd/webapps/finalFinalroject/app/views/main.scala.html
                  HASH: 5c74fc71b16c958468b18b451df8355405faf39a
                  MATRIX: 970->2|1120->57|1148->59|1265->149|1291->154|1402->238|1417->244|1483->289|4762->3541|4789->3559|4828->3560|4874->3575|4928->3602|4953->3618|4993->3620|5050->3649|5087->3659|5102->3665|5148->3690|5185->3700|5198->3704|5229->3714|5278->3745|5291->3750|5330->3751|5387->3780|5424->3790|5439->3796|5484->3820|5552->3857|5601->3878|6112->4362|6140->4369|6170->4371
                  LINES: 28->2|33->2|35->4|43->12|43->12|46->15|46->15|46->15|117->86|117->86|117->86|117->86|118->87|118->87|118->87|119->88|119->88|119->88|119->88|119->88|119->88|119->88|120->89|120->89|120->89|121->90|121->90|121->90|121->90|122->91|123->92|143->112|143->112|145->114
                  -- GENERATED --
              */
          