package uz3.example.EnumesOne;

public class Main {

    public enum Test2{ // public holatda static boladi

    }
    private enum Test{

    }

    public static void main(String[] args) {
      Seasen winter = Seasen.WINTER;
      Seasen summer = Seasen.SUMMER;

      String str = winter.Name();
        System.out.println("str: "+str);
      int i = winter.Ordinal();
        System.out.println("i: "+i);
      String str2 = winter.toString();
        System.out.println("str2: "+str2);

      Seasen[] seasens = Seasen.values;
        for (Seasen seasen : seasens) {
            System.out.print(seasen + " ");
        }
    }

}
