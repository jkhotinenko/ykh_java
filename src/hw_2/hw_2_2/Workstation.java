package hw_2.hw_2_2;

public class Workstation extends Laptop{
    @Override
    public String toString() {
        return "Workstation{" +
                "typeShell='" + typeShell + '\'' +
                ", useBusiness=" + useBusiness +
                ", isLaptop=" + isLaptop +
                ", useScreen=" + useScreen +
                ", cpu='" + cpu + '\'' +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                '}';
    }

    String typeShell;
    boolean useBusiness;

    public Workstation(String cpu, int RAM, int HDD, boolean isLaptop, boolean useScreen, String typeShell, boolean useBusiness) {
        super(cpu, RAM, HDD, isLaptop, useScreen);
        this.typeShell = typeShell;
        this.useBusiness = useBusiness;
    }

    public Workstation(String cpu, int RAM, int HDD, boolean isLaptop, boolean useScreen) {
        super(cpu, RAM, HDD, isLaptop, useScreen);
    }
}
