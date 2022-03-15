package com.company;

public class TattooMasters extends Masters {
    static String[] tattooStyle = {"hendpok", "github", "bahbah", "powpow"} ;
    //залил просто для теста, но хочу что б пользователь заполнял массив в main

    public TattooMasters() {
        super();
    }
    public TattooMasters(String masterIndustry, String masterName, String cityOfWork, Double experienceOfWorkInYears) {
        super(masterIndustry, masterName, cityOfWork, experienceOfWorkInYears);
    }

    public TattooMasters(String[] tattooStyle, String masterIndustry, String masterName, String cityOfWork, Double experienceOfWorkInYears) {
        super(masterIndustry, masterName, cityOfWork, experienceOfWorkInYears);
        this.tattooStyle = tattooStyle;
    }

    public static String masterIsReadyForStudioClients (Double experienceOfWorkInYears) {
        if (experienceOfWorkInYears > 2) {
            System.out.println("Master is ready for the Studio Clients.");
        } else {
            System.out.println("Master is not ready for the Studio Clients.");
        }
        return null;
    }
// В этом методе хочу что б он работал коректно, не выводил null в конце и выводил только одну фразу
    // либо мастер подходит, либо нет, а я сделал что он выводит кажду
    public static String masterStyleIsMatch(String tatStyle) {
        for (int i = 0; i < tattooStyle.length; i++) {
            if (tatStyle.equals(tattooStyle[i])) {
                System.out.println("This master is match your style.");
                return null;
            } else {
                System.out.println("This master is not match your style.");
            }

        }
        return null;
    }
}