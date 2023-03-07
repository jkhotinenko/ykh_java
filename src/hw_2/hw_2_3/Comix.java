package hw_2.hw_2_3;

public class Comix extends Book{
    Article mainContents;

    @Override
    public String toString() {
        return "Comix{" +
                "mainContents=" + mainContents +
                ", Face_is_colored=" + Face_is_colored +
                ", pages=" + pages +
                ", name='" + name + '\'' +
                ", quality=" + quality +
                ", color='" + color + '\'' +
                '}';
    }

    public Comix(int quality, String color, boolean face_is_colored, int pages, String name, Article mainContents) {
        super(quality, color, face_is_colored, pages, name);
        this.mainContents = mainContents;
    }
}
