package hw_2.hw_2_2;

public class Ultrabook extends Laptop{
    int screensize; //12" 15"
    int qtyKeys;    // count keys on board

    public Ultrabook(String cpu, int RAM, int HDD, boolean isLaptop, boolean useScreen, int screensize, int qtyKeys) {
        super(cpu, RAM, HDD, isLaptop, useScreen);
        this.screensize = screensize;
        this.qtyKeys = qtyKeys;
    }

    public Ultrabook(String cpu, int RAM, int HDD, boolean isLaptop, boolean useScreen) {
        super(cpu, RAM, HDD, isLaptop, useScreen);
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "screensize=" + screensize +
                ", qtyKeys=" + qtyKeys +
                ", isLaptop=" + isLaptop +
                ", useScreen=" + useScreen +
                ", cpu='" + cpu + '\'' +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                '}';
    }
}
