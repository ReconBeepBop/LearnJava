public class Constructor {
    int x;

    public Constructor(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(10);
        System.out.println(obj.x);
    }
}
