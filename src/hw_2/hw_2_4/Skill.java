package hw_2.hw_2_4;

public class Skill {
    String title;
    int exp;

    @Override
    public String toString() {
        return "Skill{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    public Skill() {
    }
}
