// Class Attributes with two Attributes x and y.

public class Attributes {
    int x = 5; 
    int y = 2;
    int z;
    final int t = 1; // Final keywork stops the ability to overwrite the attribute.

public class Person {
    int age = 20;
    String fname = "Jane";
    String lname = "Doe";
}

public static void main(String[] args) {
    Attributes one = new Attributes();
    System.out.println(one.x);
    System.out.println(one.y);
    one.x = 20;
    System.out.println(one.x);
    one.z = 10;
    System.out.println(one.x + one.y + one.z);


    Attributes two = new Attributes();
    two.y = 4;
    System.out.println(one.y);
    System.out.println(two.y);
    }
}
