package uz3.example.Homework5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static class  WeekDays {
        enum UZ {
            DUSHANBA,
            SESHANBA,
            CHORSHANBA,
            PAYSHANBA,
            JUMA,
            SHANBA,
            YAKSHANBA;
        }

        enum RU {
            ПОНЕДЕЛЬНИК,
            ВТОРНИК,
            СРЕДА,
            ЧЕТВЕРГ,
            ПЯТНИЦА,
            СУББОТА,
            ВОСКРЕСЕНЬЕ;
        }

        enum ENG {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<----------------->");
        System.out.println("UZ/ENG/RU");
        System.out.print("->");
        String str = scanner.nextLine().toUpperCase(Locale.ROOT);
        boolean forIf = !str.equals("RU") && !str.equals("UZ") && !str.equals("ENG");
        System.out.println(forIf);
        if (forIf){
            System.out.println("Shartga qara");
            return;
        }
        switch (str){
            case "UZ":{
              for(WeekDays.UZ value : WeekDays.UZ.values()){
                  System.out.println(value);
              }
                main(args);
            }
            case "RU":{
                for(WeekDays.RU value : WeekDays.RU.values()){
                    System.out.println(value);
                }
                main(args);
            }
            case "ENG":{
                for(WeekDays.ENG value : WeekDays.ENG.values()){
                    System.out.println(value);
                }
                main(args);
            }
            default: System.err.println("return programmer !!");
        }
    }

}
