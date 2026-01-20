// Abstract Class: Is a restricted class that cannot be used to create objects to access it, it must be inherited from another class.
// Abstract Method: Can only be used in an abstract class, and it does not have a body. The body is provided by the subclass.

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("ZzZ");
    }
}

class Pig extends Animal {
    @Override   
    public void animalSound() {
        System.out.println("The pig says: oink >.<");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
