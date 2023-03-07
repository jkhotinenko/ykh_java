package hw_2.hw2_add;

import java.util.ArrayList;

public class Post {
    int userId;
    int id;
    String title;
    String body;

    ArrayList<Comment> comments = new ArrayList<Comment>();

    @Override
    public String toString() {
        return "Post{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", comments=" + comments +
                '}';
    }

    public Post(int userId, int id, String title, String body, ArrayList<Comment> comments) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.comments = comments;
    }

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post() {
    }
}
