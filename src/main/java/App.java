import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.Hero;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
public class App {
    public static void main(String[] args){
        staticFileLocation("/public");
        staticFileLocation("/templates");
        get("/",(request, response) -> {
            Map<String,Object> model = new HashMap<String,Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());


    }

}
