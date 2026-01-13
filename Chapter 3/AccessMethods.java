public class AccessMethods {
    
    public void fullThrotle() {
        System.out.println("The car is at max speeed");
    }

    public void Speed(int maxSpeed) {
        System.out.println("Max Speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        AccessMethods Car = new AccessMethods();
        Car.fullThrotle();
        Car.Speed(150);
    }
}
