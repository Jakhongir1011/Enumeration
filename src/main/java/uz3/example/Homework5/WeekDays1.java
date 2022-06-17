package uz3.example.Homework5;

import uz3.example.English;
import uz3.example.Russian;

public enum WeekDays1 implements English, Russian {
    MONDAY(1,"Dushanba"),
    TUESDAY(2,"Seshanba"),
    WEDNESDAY(3,"Chorshanba"),
    THURSDAY(4,"Payshanba"),
    FRIDAY(5,"Juma"),
    SATURDAY(6,"Shanba"),
    SUNDAY(7,"Yakshanba");

    @Override
    public String nameEn() {
        switch (this){
            case MONDAY: return "Понедельник ";
            case TUESDAY: return "вторник ";
            case WEDNESDAY: return "среда ";
            case THURSDAY: return "Четверг ";
            case FRIDAY: return "Пятница ";
            case SATURDAY: return "Суббота ";
            case SUNDAY: return "воскресенье";
        }
        return "";
    }

    @Override
    public String nameRu() {
        switch (this){
            case MONDAY: return "monday";
            case TUESDAY: return "tuesday";
            case WEDNESDAY: return "wednesday";
            case THURSDAY: return "thursday";
            case FRIDAY: return "friday";
            case SATURDAY: return "saturday";
            case SUNDAY: return "sunday";
        }
        return "";
    }

    WeekDays1(int number, String nameUz) {
        this.nameUz = nameUz;
        this.number = number;
    }

    private String nameUz;
    private int number;

    public String getName() {
        return nameUz;
    }

    public void setName(String nameUz) {
        this.nameUz = nameUz;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "WeekDays{" +
                "name='" + nameUz + '\'' +
                ", number=" + number +
                '}';
    }


}
