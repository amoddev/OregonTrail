package com.amoddev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DisplayManager display = new DisplayManager();
        Settings settings = new Settings();
        Scanner scanner =  new Scanner(System.in);


        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();

        display.Switcher(1);
        System.out.println("Enter your first persons name.");
        player1.setName(scanner.nextLine());

        System.out.println("Enter your second persons name.");
        player2.setName(scanner.nextLine());

        System.out.println("Enter your third persons name.");
        player3.setName(scanner.nextLine());

        System.out.println("Enter your fourth persons name.");
        player4.setName(scanner.nextLine());

        System.out.println("O.K. What will be your profession?");
        System.out.println(" 1. Banker from Boston");
        System.out.println(" 2. Farmer from Illinois");
        System.out.println(" 3. Carpenter from Ohio");
        settings.setOccupation(scanner.nextInt());
        if(settings.getOccupation() == 1){
            settings.setMoney(1600);
        }else if (settings.getOccupation() == 2) {
            settings.setMoney(400);
        }else if (settings.getOccupation() == 3) {
            settings.setMoney(800);
        }
        display.clear(12);
        display.Switcher(2);

        int input = scanner.nextInt();

        if(input == 1){
            settings.setMonth(3);
        } else if(input == 2){
           settings.setMonth(4);
        }else if(input == 3){
            settings.setMonth(5);
        }




    }
}
