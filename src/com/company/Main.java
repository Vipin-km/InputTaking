package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you year of birth");
        boolean hasNextInt = scan.hasNextInt();

        if (hasNextInt==  true) {
            int year = scan.nextInt();
            System.out.println("Enter the name: ");
            String name =scan.nextLine();

            int age = 2020- year;
            if (age >=0 && age <=100) {
                System.out.println("Your name is :" + name + " and you're " + age + " years old ");
            }   else {
                System.out.println(" Unable to parse the year of birth :) ");
            }
        }
        else {
            System.out.println("You have entered envalid year :) ");
        }
        scan.close();
    }
}
