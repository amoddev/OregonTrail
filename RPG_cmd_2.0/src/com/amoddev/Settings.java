package com.amoddev;

public class Settings {

    private int occupation = 0;

    // 1 - 12
    private int month_start = 0;

    //1 - 30
    private int day = 1;
    private Boolean isEvenOrOddMonth = null;

    private int money =0;

    public int getOccupation(){
        return occupation;
    }
    public void setOccupation(int set){
        occupation = set;
    }

    public int getMonth(){
        return month_start;
    }
    public void setMonth(int set){ month_start = set; }

    public int getMoney(){
        return money;
    }
    public void setMoney(int set){ money = set; }

}
