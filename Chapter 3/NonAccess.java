/* 
final - can no longer change
static - can call without creating an object of the classs
abstract - 
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
