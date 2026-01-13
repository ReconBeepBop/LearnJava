public class fishtank {
    int fishnumber;
    float tankTemp;
    boolean oxygenated;

    public fishtank(float tankTemp) {
        this(0,tankTemp,false);
    }

    public fishtank(int fishnumber, float tankTemp, boolean oxygenated) {
        this.fishnumber = fishnumber;
        this.tankTemp = tankTemp;
        this.oxygenated = oxygenated;
    }

    public void printInfo() {
        System.out.println(fishnumber + " " + tankTemp + " " + oxygenated);
    }

    public static void main(String[] args) {
        fishtank ft = new fishtank(5);
        ft.printInfo();
    }
}
