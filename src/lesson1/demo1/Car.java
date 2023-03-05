package lesson1.demo1;

public class Car {
    String model;
    String power;
int volumeEngine;
boolean turbo;

    public Car() {
    }

    public Car(String model, String power, int volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power='" + power + '\'' +
                ", volumeEngine=" + volumeEngine +
                ", turbo=" + turbo +
                '}';
    }
}
