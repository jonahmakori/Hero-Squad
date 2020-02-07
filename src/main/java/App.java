import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
    public static void main(String[] args){
        Map<String,Object> model = new HashMap<>();
        port(getHerokuAssignedPort());
        staticFileLocation("/public");

        get("/",(request, response) -> {
            return new ModelAndView(model, "home.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero",(request, response) -> {
            ArrayList<Hero> hero = Hero.getNumberOfHeros();
            model.put("hero",hero);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/success", (request, response) -> {
            String name = request.queryParams("name");
            String weakness = request.queryParams("weakness");
            String powers = request.queryParams("powers");
            String squadTeam = request.queryParams("squadTeam");
            int age = Integer.parseInt(request.queryParams("age"));
            Hero newHero = new Hero(name,weakness,powers,age,squadTeam);
            model.put("hero", newHero);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero/:id", (request, response) -> {
            int id = Integer.parseInt(request.params(":id"));
            ArrayList<Hero> hero = Hero.getNumberOfHeros();
            model.put("hero",hero);
            Hero heroFound = Hero.findById(id);
            model.put("heroFound",heroFound);
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());



        post("/squad-created", (request, response) -> {
            String name = request.queryParams("name");
            String mission = request.queryParams("mission");
            int size = Integer.parseInt(request.queryParams("size"));
            Squad squad = new Squad(name, mission, size,1);
            return new ModelAndView(model, "squad-success.hbs");
        }, new HandlebarsTemplateEngine());


        get("/squads",(request, response) -> {
            ArrayList squad = Squad.getMySquads();
            ArrayList hero = Hero.getNumberOfHeros();
            int size = hero.size();
            model.put("squads", squad);
            model.put("hero", hero);
            model.put("size",size);
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

    }

}
