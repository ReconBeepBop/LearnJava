class Animal {
    String type = "Animal";
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        super.animalSound();
        System.out.println("The pig says: oink!");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: bark!");
    }
    public void printType() {
        System.out.println(super.type);
    }
}

class Penguin extends Animal {
    Penguin() {
        super();
        System.out.println("Penguin has been created >//<");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Dog myDog = new Dog();
        Penguin myPenguin  = new Penguin();

        //myAnimal.animalSound();
        //myPig.animalSound();
        //myDog.printType();
    }
}