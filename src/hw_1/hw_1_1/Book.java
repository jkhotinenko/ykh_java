package hw_1.hw_1_1;

import java.util.Arrays;

public class Book {
    String title;
    int pages;
    String Authors[] = new String[1];
    String genre;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", Authors=" + Arrays.toString(Authors) +
                ", genre='" + genre + '\'' +
                '}';
    }
}


