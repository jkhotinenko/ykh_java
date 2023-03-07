package hw_2.hw_2_3;

public class Article {
    String name;
    String contents;
    int pictures;

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", contents='" + contents + '\'' +
                ", pictures=" + pictures +
                '}';
    }

    public Article(String name, String contents, int pictures) {
        this.name = name;
        this.contents = contents;
        this.pictures = pictures;
    }

    public Article() {
    }
}
