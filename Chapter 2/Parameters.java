public class Parameters {

    static void Naming(String fname) {
        System.out.println(fname + " Refsnea");
    }
    static int factorial(int N) {
        int fact = 1;
        for (int i = 2; i <= N; i++) {
            fact *= i;
        }
    return fact;
    }
    public static void main(String[] args) {
        // Naming("Tom");
        System.out.println(factorial(6));
    }
}
