package models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Hero {
    private int  age;
    private String name;
    private String powers;
    private String weakness;
    private boolean created = false;
    private LocalDateTime addedAt;
    private boolean added;
    private int id;
    private String squadTeam;
    private static ArrayList<Hero>numberOfHeros = new ArrayList<>();


    public Hero(String name, String powers, String weakness, int age ,String squadTeam) {
        this.name = name;
        this.age = age;
        this.powers = powers;
        this.weakness = weakness;
        numberOfHeros.add(this);
        this.added = false;
        this.id = numberOfHeros.size();
        this.addedAt = LocalDateTime.now();
        this.squadTeam = squadTeam;
    }


    public static void clearAllHeros() {
        numberOfHeros.clear();
    }

    public static ArrayList getNumberOfHeros() {
        return numberOfHeros;
    }


    public int getAge(){
        return age;
    }
    public String getWeakness(){
        return weakness;
    }
    public String getPowers(){
        return powers;
    }
    public String getName(){
        return name;
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
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }

    public void setAddedAt(LocalDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setAdded(boolean added) {
        this.added = added;
    }

    public void setId(int id) {
        this.id = id;
    }


    public static void setNumberOfHeros(ArrayList<Hero> numberOfHeros) {
        Hero.numberOfHeros = numberOfHeros;
    }
    public static Hero findById(int id) {
        return numberOfHeros.get(id-1);
    }

    public String getSquadTeam() {
        return squadTeam;
    }
}
