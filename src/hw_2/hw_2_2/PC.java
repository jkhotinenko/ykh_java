package hw_2.hw_2_2;

public class PC {
    String cpu;  //i3 i5 i7
    int    RAM;  //GB
    int    HDD;  //GB

    public PC(String cpu, int RAM, int HDD) {
        this.cpu = cpu;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public PC() {
    }
}
