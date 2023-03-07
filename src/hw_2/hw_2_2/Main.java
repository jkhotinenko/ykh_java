package hw_2.hw_2_2;

public class Main {
    public static void main(String[] args) {
        Ultrabook ultrabook = new Ultrabook("i7",16,512,true,true,12,86);
        System.out.println(ultrabook);
        Workstation workstation = new Workstation("i5",8,256,false,false,"Big",true);
        System.out.println((workstation));
    }



}
