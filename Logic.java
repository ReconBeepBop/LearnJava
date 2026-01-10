/*
&& AND
|| OR
! NOT
 */

public class Logic {
    public static void main(String[] args) {
        
        boolean isLoggedIn = true, isAdmin = false;
        int SecurityLevel = 3;

        if (isLoggedIn && (isAdmin || SecurityLevel <=2)) {
            System.out.println("Access Granted.");
        } else {
            System.out.println("Access Denied!");
        }
    }
}
