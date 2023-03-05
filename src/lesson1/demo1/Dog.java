package lesson1.demo1;

public class Dog {
    String name;
    int  age;
    String poroda;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", poroda='" + poroda + '\'' +
                '}';
    }

    public Dog(String name, int age, String poroda) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }

    public Dog() {
    }


}
