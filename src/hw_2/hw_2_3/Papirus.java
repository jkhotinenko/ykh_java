package hw_2.hw_2_3;

public class Papirus {
    int quality;
    String color;

    @Override
    public String toString() {
        return "Papirus{" +
                "quality=" + quality +
                ", color='" + color + '\'' +
                '}';
    }

    public Papirus(int quality, String color) {
        this.quality = quality;
        this.color = color;
    }

    public Papirus() {
    }
}
