public class Method_Overloading {

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        int num1 = plusMethod(1, 2);
        double num2 = plusMethod(1.0001, 5.612);
        System.out.println(num1);
        System.out.println(num2);
    }
}
