/* 
final - can no longer change
static - can call without creating an object of the classs
abstract - belongs to the abstract class, without a body.

attributes and methods:
final 
static
abstract
transient -> attributes + methods skipped when serialising object
synchronized -> methods can only be accessed one thread at a time
volatile -> value of attribute not cached thread locally, read from main memory
*/ 

public class NonAccess {
    final int x = 10;
    final double PI = 3.14;\

    public static void main(String[] args) {
        NonAccess Obj = new NonAccess();
        Obj.x = 50; // ERROR
        Obj.PI = 25; // ERROR
        
    }
}
