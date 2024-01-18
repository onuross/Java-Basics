public class MultiDimensionalArray {
    public static void main(String[] args) {
        // int [] 1Darr = new int[5]
        int [][] table = new int[][]{
                {1,75,10},
                {2,87,13},
        };
        /*
        int[][] table2 = new int[5][2];
        table2[0][0] = 1;
        table2[0][1] = 75;
        */

        for (int[] ints : table) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.println(ints[j] + " ");
            }
            System.out.println();
        }

        for(int[] row: table){
            for (int value : row){
                System.out.println(value + " ");
            }
            System.out.println();
        }
    }
}
