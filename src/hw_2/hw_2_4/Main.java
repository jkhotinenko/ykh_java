package hw_2.hw_2_4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        ArrayList<Skill> skills=new ArrayList<Skill>();
        Skill skill1= new Skill("java",10);
        Skill skill2= new Skill("js",10);
        Skill skill3= new Skill("c++",10);
        skills.add(skill1);
        skills.add(skill2);
        skills.add(skill3);
        Car car = new Car("toyota",2022,150);
        People people =new People(1,"vasya","pupkin","asd@asd.com",31,Gender.MALE,skills,car);
        System.out.println(people);
    }
}
