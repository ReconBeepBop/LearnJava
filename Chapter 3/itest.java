/*
Subclass: (child) ; this class inherits
Superclass
 */

// could put final here to stop inheritance 
class itest {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends itest {
    private final String modelName = "Mustang";
    public static void main(String[] args) {
        
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + "" + myCar.modelName);
    }
}     