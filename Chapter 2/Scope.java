public class Scope {
    public static void main(String[] args) {

        // Method scope:

        // code here cannot use x

        int x = 1;

        // code here can use x

        // Block scope:

        // { This is a block

        // code here cannot use y

        int y = 2;

        // code here can use y

        // } the block ends here

        // code here cannot use y
        
    }
}
