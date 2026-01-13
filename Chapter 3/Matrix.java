import java.util.Scanner;

public class Matrix {
    public static float Determinant(float a, float b,float c, float d) {
        return (a*d - b*c);
    }

    public static void main(String[] args) {
        float a, b, c, d;
        System.out.println("Enter matrix details: (tl, tr, bl, br):");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        System.out.println("Determinant = " + Determinant(a,b,c,d));
    }  
}

