package hw_2.hw_2_2;

public class Laptop extends PC{
    boolean isLaptop;
    boolean useScreen;

    public Laptop(String cpu, int RAM, int HDD, boolean isLaptop, boolean useScreen) {
        super(cpu, RAM, HDD);
        this.isLaptop = isLaptop;
        this.useScreen = useScreen;
    }
}
