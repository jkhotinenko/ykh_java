package hw_2.hw_2_3;

public class Book extends Papirus{
    boolean Face_is_colored;
    int pages;
    String name;

    public Book() {
    }

    public Book(int quality, String color, boolean face_is_colored, int pages, String name) {
        super(quality, color);
        Face_is_colored = face_is_colored;
        this.pages = pages;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Face_is_colored=" + Face_is_colored +
                ", pages=" + pages +
                ", name='" + name + '\'' +
                ", quality=" + quality +
                ", color='" + color + '\'' +
                '}';
    }
}
