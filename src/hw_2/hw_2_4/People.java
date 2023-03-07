package hw_2.hw_2_4;

import java.util.ArrayList;

public class People {
    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", skills=" + skills +
                ", car=" + car +
                '}';
    }

    public People(int id, String name, String surname, String email, int age, Gender gender, ArrayList<Skill> skills, Car car) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = car;
    }

    public People() {
    }

    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    ArrayList<Skill> skills;
    Car car;



}
