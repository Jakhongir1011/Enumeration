package uz3.example.Enumes;

import java.util.EnumSet;
import java.util.Set;

public class EnumExample {
    public static void main(String[] args) {
        Enumes summer = Enumes.SUMMER;
        Enumes winter = Enumes.WINTER;
        System.out.println("name: "+ summer.name());
        System.out.println("getUzName: "+ summer.getUzName());

        // switch
        switch (summer){
            case AUTUMN:
                System.out.println("");
            case SPRING:
                System.out.println("");
            case SUMMER:
                System.out.println("");
            case WINTER:
                System.out.println("");
            default:
                System.out.println("");
        }

        // ordinal and compareTo
        System.out.println(summer.compareTo(winter));
        System.out.println("ordinal: "+summer.ordinal());

        // values
        Enumes[] values = Enumes.values();
        for (Enumes value : values) {
            System.out.println(value);
        }

        //  String shaklidagi Objectdan -> Enumes shaklidagi Object yaratib olindi
        Enumes winter2 = Enumes.valueOf("WINTER");
        System.out.println(winter2.getUzName()); // Qish

        // EnumSet, allOf    -> bu Collection qilib oldi
        Set<Enumes> enumesSet = EnumSet.allOf(Enumes.class);
        System.out.println(enumesSet);

       //  EnumSet , range  -> shu oraliqdagi Objectlarni chiqazib beradi
        EnumSet<Enumes> enumes =EnumSet.range(Enumes.WINTER,Enumes.SUMMER);
        System.out.println(enumes);

        // russian name
        System.out.println("russian name: "+winter.nameRu());
    }
}
