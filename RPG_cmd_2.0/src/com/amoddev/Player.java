package com.amoddev;

public class Player {

    private float Fhealth = 10.0f;
    private int location = 0;
    private int weapon = 0;
    private String name;


    public void setFhealth(float fhealth) {

        Fhealth = fhealth;
    }

    public void setLocation(int location) {

        this.location = location;
    }

    public void setWeapon(int weapon) {

        this.weapon = weapon;
    }

    public void setName(String name) {

        this.name = name;
    }

    public float getFhealth(){

        return Fhealth;
    }

    public int getLocation() {

        return location;

    }

    public int getWeapon() {

        return weapon;

    }

    public String getName() {

        return name;

    }
}
