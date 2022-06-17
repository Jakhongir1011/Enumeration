package uz3.example.Homework4;

public class Main {
    public static void main(String[] args) {

       MonthName monthName = MonthName.APRIL;

       switch (monthName){
           case MARCH:
           case APRIL:
           case MAY:
               System.out.println("SPRING");break;
           case JUNE:
           case JULY:
           case AUGUST:
               System.out.println("SUMMER");break;
           case SEPTEMBER:
           case OCTOBER:
           case NOVEMBER:
               System.out.println("AUTUMN");break;
           case DECEMBER:
           case JANUARY:
           case FEBRUARY:
               System.out.println("WINTER");break;
           default:
               System.out.println(" ");
       }
    }
}
