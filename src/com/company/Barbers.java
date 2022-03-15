package com.company;

public class Barbers extends Masters{
    String styleOfBarber;
    public Barbers(String styleOfBarber, String masterIndustry, String masterName, String cityOfWork, Double experienceOfWorkInYears){
        super(masterIndustry, masterName, cityOfWork, experienceOfWorkInYears);
        this.styleOfBarber = styleOfBarber;
    }
    public Barbers(String masterIndustry, String masterName, String cityOfWork, Double experienceOfWorkInYears){
        super(masterIndustry, masterName, cityOfWork, experienceOfWorkInYears);
    }
    public static String ifMasterLOH (String name){
        if (name.equals("Denis")) {
            System.out.print("You are loh!");
        } else {
            System.out.print("You are rovniy pazan!");
        }
        return name + "!!!";
    }
    public static String masterIsReadyForStudioClients (Double experienceOfWorkInYears) {
        if (experienceOfWorkInYears > 2) {
            System.out.println("Master is ready for the Studio Clients.");
        } else {
            System.out.println("Master is not ready for the Studio Clients.");
        }
        return null;
    }
}
