package com.company;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Scanner;

public class Main {
     static void codeword() {

        // No need to mention the
        // Generic type twice
        Hashtable<String, Integer> ht1= new Hashtable();

        // Initialization of a Hashtable
        // using Generics


        // Inserting the Elements
        // using put() method
        ht1.put ("one",1);
        ht1.put("two",2);
        ht1.put("three",3);


        Scanner myCodeword = new Scanner(System.in);

        System.out.println("What is your code word?");
        String pass = myCodeword.next();
         while (!Objects.equals(pass, "one" )){
             System.exit(1);
             break;}
        while (Objects.equals(pass, "one" )){
        if (Objects.equals(ht1.containsKey("one"),true)) {
            //System.exit(1);
            System.out.println("Welcome to the secret paint calculator");
            break;
        }




    }}







    static int wallsmethod() {

        Scanner myObj = new Scanner(System.in);

        System.out.println("What is the width of all of the walls in the room added(in meters)?");

        float width = myObj.nextFloat();

        System.out.println("What is the height of the room(in meters)?");

        float height = myObj.nextFloat();


        System.out.println("How much paint is in the container?(in litres)");

        float litres = myObj.nextFloat();

        float area = width * height;
        float arealitres = area / litres;
        float numberoflitres = arealitres / 12;
        float numberofpaintcans = numberoflitres / litres;
        double rounded = Math.ceil(numberofpaintcans / 100);
        int Introunded = (int) rounded;


        if (Introunded == 1) {
            System.out.println(rounded);
            System.out.println("paint can");
        } else {
            System.out.println(rounded);
            System.out.println("paint cans");
        }
        switch (Introunded) {
            case 1:
                System.out.println("Lucky you, you won't need much paint at all!");
                break;
            case 2, 3, 4:
                System.out.println("Might need a fair bit of paint!");
                break;
            case 5, 6, 7:
                System.out.println("Thats a lot of paint make sure you get a good deal");
                break;
            case 8, 9, 10:
                System.out.println("You are going to need a loan for all this paint!");
                break;
            default:
                System.out.println("Just give up now!");
                break;

        }

        return Introunded;
    }

    static void cost(int numberofpaintcans) {

        Scanner myCost = new Scanner(System.in);
        System.out.println("Would you like to see the cost?");

        String decision = myCost.next();

        String decision1 = "yes";
        String decision2 = "no";

        while (Objects.equals(decision, decision1)) {
            System.out.print("What type of brand of paint do you have?(d for dulex, f for Farrow and ball)?");
            String choice = myCost.next();
            String outcome1 = "d";
            String outcome2 = "f";
            if (Objects.equals(choice, outcome1)) {
                double costdulex = numberofpaintcans * 3;


            }
            break;
        }


    }


    public static void main(String[] args) {
        codeword();
        int numberofpaintcans;
        numberofpaintcans = wallsmethod();

        cost(numberofpaintcans);


    }


}


















