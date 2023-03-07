package hw_2.hw_2_4;

public class Car {
    String model;
    int year;
    int power;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", power=" + power +
                '}';
    }

    public Car(String model, int year, int power) {
        this.model = model;
        this.year = year;
        this.power = power;
    }

    public Car() {
    }
}
