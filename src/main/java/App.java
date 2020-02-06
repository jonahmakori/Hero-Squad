import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
public class App {
    public static void main(String[] args){
        Map<String,Object> model = new HashMap<>();
        staticFileLocation("/public");

        get("/",(request, response) -> {
            ArrayList<Hero> hero = Hero.getNumberOfHeros();
            model.put("hero",hero);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/success", (request, response) -> { //URL to make new post on POST route
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
//            int idOfHeroToFind = Integer.parseInt(request.params(":id"));
//            Hero foundHero = Hero.findById(idOfHeroToFind);
            String name = request.queryParams("name");
            String mission = request.queryParams("mission");
            int size = Integer.parseInt(request.queryParams("size"));
            Squad squad = new Squad(name, mission, size,1);
//            model.put("hero",foundHero);
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
