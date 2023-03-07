package hw_2.hw_2_3;

import java.util.ArrayList;

public class Journal extends Book{
    ArrayList<Article> contents= new ArrayList<>();

    @Override
    public String toString() {
        return "Journal{" +
                "contents=" + contents +
                ", Face_is_colored=" + Face_is_colored +
                ", pages=" + pages +
                ", name='" + name + '\'' +
                ", quality=" + quality +
                ", color='" + color + '\'' +
                '}';
    }

    public Journal(int quality, String color, boolean face_is_colored, int pages, String name, ArrayList<Article> contents) {
        super(quality, color, face_is_colored, pages, name);
        this.contents = contents;
    }
}
