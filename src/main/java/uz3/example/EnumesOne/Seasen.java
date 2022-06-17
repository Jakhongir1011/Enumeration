package uz3.example.EnumesOne;

public class Seasen {
    private String name;
    private int ordinal;

    private Seasen(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public static final Seasen WINTER = new Seasen("WINTER",0);
    public static final  Seasen SPRING = new Seasen("SPRING",1);
    public static final Seasen SUMMER = new Seasen("SUMMER",2);
    public static final  Seasen AUTUMN = new Seasen("AUTUMN",3);

    public static Seasen[]  values = {WINTER,SPRING,SUMMER,AUTUMN};

    public String Name() {
        return name;
    }

    public int Ordinal() {
        return ordinal;
    }


    @Override
    public String toString() {
        return name;
    }
}
