package hw_2.hw_2_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println("First Comix");
        Article atcl = new Article("Comix First","Context",20);
        Comix comix = new Comix(80,"white",true,20,"Урумчи",atcl);
        System.out.println(comix);

        System.out.println("Second Journal");

        ArrayList<Article> latic = new ArrayList<Article>();
        latic.add(new Article("Antenas using","Contents of Antennas",1));
        latic.add(new Article("CO laser using","Contents of Lasers",2));

        Journal journal = new Journal(80,"grey",false,10,"Radiophisics",latic);
        System.out.println(journal);
        System.out.println("Finish");
    }
}
