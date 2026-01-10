public class MultiDimension {
    public static void main(String[] args) {
        int[][] Nums = { {0,2,4}, {1,3,5} };
        System.out.println(Nums[1][2]); // Outputs 5
        Nums[1][2] = 9;
        System.out.println(Nums[1][2]); // Outputs 9
        

        int[][] Many = { {1,4,4}, {5,6,8,1,3} };

        for (int row = 0; row < Many.length; row++) {
            for (int col  = 0; col < Many[row].length; col++) {
                System.out.println("Many[" + row + "][" + col + "] = " + Many[row][col]);
            }
        }

        for (int[] row : Many) {
            for (int num : row) {
                System.out.println(num);
            }
        }
    }
}