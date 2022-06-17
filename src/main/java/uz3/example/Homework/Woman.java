package uz3.example.Homework;

public enum Woman {

    WOMAN("Donohon","ayol kishi");

    private String name;
    private String gander;

    Woman(String name, String gander) {
        this.name = name;
        this.gander = gander;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", gander='" + gander + '\'' +
                '}';
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }
}
