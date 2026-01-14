/*
Package used to group related classes

Built In Packages:
Java API => libary of prewritten classes, free to use included in JDE
managing input, database programming... oracle website
seperated into packages and classes
User-Definined Packages:
import package.name.Class
import package.name.*
*/


import java.util.Scanner; // java.util is the package scanner is the class
public class Packages {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Username: ");

        String userName = obj.nextLine();
        System.out.println("Username is: " + userName);

        obj.close();
    }
}
