public class Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        } 

        for (int j = 0; j <=10; j++) {
            if (j == 3) {
                continue;
            }
            if (j == 7) {
                break;
            }
            System.out.println(j);
        }
    }
}
