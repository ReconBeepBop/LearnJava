// We define an array by adding [] after the data type

public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Ford", "Lambo", "Ferari"};
        int[] numbers = {10,100,1000,10000};
        numbers[2] = 1;

        System.out.println(cars[0]);
        System.out.println(numbers[2]);
        System.out.println(cars.length);

        String []  test = new String[4]; // Creates an empty list of size 4
        test[0] = "e";
        test[1] = "r";
        test[2] = "y";
        test[3] = "n";

        for (String letter : test) {
            System.out.println(letter);
        }

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}
