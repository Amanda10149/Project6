package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;



import models.*;
import models.users.*;

import views.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    
    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }
    
    // get logged in user
    // User.getUserById(session().get("email"))
   

    public Result index() {
        
        List<Product> productList = Product.findAll();

        return ok(views.html.index.render(User.getUserById(session().get("email"))));
        //return ok(views.html.index.render());

    }

    public Result about() {
        
        List<Product> productList = Product.findAll();

        return ok(views.html.about.render(User.getUserById(session().get("email"))));

    }

    public Result tv() {
        
        List<Product> productList = Product.findAll();

        return ok(views.html.tv.render(productList, User.getUserById(session().get("email")) ));
    
    }

    public Result   Phones() {
        
        List<Product> productList = Product.findAll();

        return ok(views.html.Phones.render(productList, User.getUserById(session().get("email"))));

    }

    public Result FAQ() {
        
        Form<Question> newQuestionForm = formFactory.form(Question.class);

        return ok(views.html.FAQ.render(newQuestionForm, User.getUserById(session().get("email"))));

    }

    public Result addQuestionSubmit() {
        
                Form<Question> newQuestionForm = formFactory.form(Question.class).bindFromRequest();
        
                if (newQuestionForm.hasErrors()) {
                    return badRequest(views.html.FAQ.render(newQuestionForm, User.getUserById(session().get("email"))));
        
                }else {
                    Question newQuestion = newQuestionForm.get();
        
                    newQuestion.save();
                    
                    flash("success", "Question "+ newQuestion.getName() + "was Submitted");
        
                    return redirect(controllers.routes.HomeController.FAQ());
                    
                
                }
            }


    public Result Laptop() {

        List<Product> productList = Product.findAll();

        return ok(views.html.Laptop.render(productList, User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addProduct() {
        
        Form<Product> productForm = formFactory.form(Product.class);

        return ok(views.html.addProduct.render(productForm, User.getUserById(session().get("email"))));

    }

    public Result addProductSubmit() {

        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        if (newProductForm.hasErrors()) {
            return badRequest(views.html.addProduct.render(newProductForm, User.getUserById(session().get("email"))));

        }else {
            Product newProduct = newProductForm.get();

            newProduct.save();
            
            flash("success", "Product "+ newProduct.getName() + "was added");

            return redirect(controllers.routes.HomeController.Laptop());
            
        
        }
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteProduct(Long id){
    
    
        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");

        return redirect(routes.HomeController.Laptop());

    
        
    }

}
