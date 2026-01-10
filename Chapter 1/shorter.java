public class shorter {
    public static void main(String[] args) {
        /* 
        int time = 20;
        if (time < 18) {
            System.out.println("Good Day.");
        } else {
            System.out.println("Good Evening.");
        }
        */

        /*
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening," ;
        System.out.println(result);
         */

        
        int time = 20;
        System.out.println((time<18) ? "Good day." : "Good evening."); 

        int age = 18;
        String message = (age < 12) ? "Good morning."
                       : (age < 18) ? "Good afternoon."
                       : "Good evening.";
        System.out.println(message);
    }
}
