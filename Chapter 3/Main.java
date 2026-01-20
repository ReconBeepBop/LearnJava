interface Animal {
    public void animalSound();
    public void sleep();
}

class Pig implements Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: OINK!!");
    }
    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }
}

// Multiple interfaces

interface FirstInterface {
    public void myMethod();
}

interface Secondinterface {
    public void myOtherMethod();
}

class DemoClass implements FirstInterface, Secondinterface {
    public void myMethod() {
        System.out.println("text1");
    }
    public void myOtherMethod() {
        System.out.println("text2");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        DemoClass Obj = new DemoClass();
        Obj.myMethod();
        Obj.myOtherMethod();
    }
}
