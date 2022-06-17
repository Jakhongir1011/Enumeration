package uz3.example.Homework;

import uz3.example.Enumes.Person;

public class Main {
    public static void main(String[] args) {
        Man ERKAK = Man.MAN;
        System.out.println(ERKAK.getName());
        System.out.println(ERKAK.getGander());
        System.out.println(ERKAK.toString());
        System.out.println(ERKAK.name());

        Person[] person = Person.values();
        for (Person person1 : person) {
            System.out.println(person1);
        }
    }
}
