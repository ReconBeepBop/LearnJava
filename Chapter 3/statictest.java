public class statictest {
    static void myStaticMethod() {
        System.out.println("This doesnt need an object");
    }
    public static void main(String[] args) {
        myStaticMethod();
        statictest.myStaticMethod();
    }
}
