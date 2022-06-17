package uz3.example.Enumes;

import uz3.example.Russian;

public enum Enumes implements Russian {
    WINTER("Qish"),
    SPRING("Baxor"),
    SUMMER("Yoz"),
    AUTUMN("Kuz");

    private String uzName;

    Enumes(String uzName) {
        this.uzName = uzName;
    }

    public String getUzName() {
        return uzName;
    }

    public void setUzName(String uzName) {
        this.uzName = uzName;
    }

    @Override
    public String nameRu() {
        switch (this){
            case WINTER:return "Zima";
            case SUMMER:return "Leto";
            case AUTUMN:return "Osen";
            case SPRING:return "Vesna";
        }
        return "";
    }
}
