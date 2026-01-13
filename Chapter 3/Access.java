/*  Class Modifiers:
public -> class accessible by any other class
default -> The class is only accessible by calsses in the same package
*/

/* Atrributes, Methods and Constructors
public -> accessible for all classes
private ->  code accessible within the declared class
default -> The class is only accessible by calsses in the same package
protected -> only accessible in the same package and sub-classes (inheritance)
 */

class person {
    public String name = "John";
    private int age = 30;
}

public class Access {
    public static void main(String[] args) {
        person p = new person();
        System.out.println(p.age); // ERROR
        System.out.println(p.name);
    }
}
