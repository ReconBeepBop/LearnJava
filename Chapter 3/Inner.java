class OuterClass {
    int x = 10;

    /*
    private class InnerClass {
        int y =5;
    } 
    */
    static class InnerClass {
        int y = 5;
    }
}

public class Inner {
    public static void main(String[] args) {
        //OuterClass Outer = new OuterClass();
        OuterClass.InnerClass Inner = new OuterClass.InnerClass();
        System.out.println(Inner.y);
    }
}

