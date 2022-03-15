package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your industry: ");
        String industry = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter your city: ");
        String city = input.nextLine();

        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter your experience: ");
        Double exp = input.nextDouble();

        //Barbers denis = new Barbers(industry, name, city, exp);
       // System.out.println(denis.ifMasterLOH(name));
        //System.out.println(denis.masterIsReadyForStudioClients(exp));
      TattooMasters dima = new TattooMasters(industry, name, city, exp);
      System.out.println(dima.masterStyleIsMatch(city));

    }

}


