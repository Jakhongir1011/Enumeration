package uz3.example.Homework;

public enum Man {
    MAN("Jahongir","erkak");
    private String name;
    private String gander;

    Man(String name, String gander) {
        this.name = name;
        this.gander = gander;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", gander='" + gander + '\'' +
                '}';
    }
}
