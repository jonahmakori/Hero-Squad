package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Hero {
    private int  age;
    private String name;
    private String powers;
    private String weakness;
    private static ArrayList<Hero>numberOfHeros = new ArrayList<>();
    private boolean added;
    private int id;
    private LocalDateTime addedAt;

    public Hero(String name, String powers, String weakness, int age ) {
        this.name = name;
        this.age = age;
        this.powers = powers;
        this.weakness = weakness;
        numberOfHeros.add(this);
        this.added = false;
        this.id = numberOfHeros.size();
        this.addedAt = LocalDateTime.now();

    }

    public static void clearAllHeros() {
        numberOfHeros.clear();
    }


    public int getAge(){
        return this.age;
    }
    public String getWeakness(){
        return this.weakness;
    }
    public String getPowers(){
        return this.powers;
    }
    public String getName(){
        return this.name;
    }

    public static ArrayList<Hero> getAll() {
        return numberOfHeros;
    }
    public boolean getAdded(){
        return this.added;
    }
    public LocalDateTime getCreatedAt() {

        return addedAt;
    }
    public int getId() {
        return id;
    }
    public static Hero findById(int id) {
        return numberOfHeros.get(id-1);
    }

}
