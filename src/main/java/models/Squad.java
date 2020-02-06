package models;

import java.util.ArrayList;

public class Squad {
    public String mission;
    public String name;
    public int size;
    public int id;
    private static ArrayList<Squad> mySquads = new ArrayList<>();
    public Squad( String name, String mission,int size,int id){
        this.mission = mission;
        this.name = name;
        this.size = size;
        this.id = id;
        mySquads.add(this);
    }

    public static ArrayList getMySquads() {
        return mySquads;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}