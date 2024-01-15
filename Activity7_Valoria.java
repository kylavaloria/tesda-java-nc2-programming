
public class Activity7_Valoria {
    public static void main(String[] args) {
        int[] singleDArray = {10, 20, 30, 40, 50};

        System.out.println("Single-dimensional array traversal using for loop:");
        for (int i = 0; i < singleDArray.length; i++) {
            System.out.print(singleDArray[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Single-dimensional array traversal using enhanced for loop:");
        for (int element : singleDArray) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        int[][] multiDArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Multi-dimensional array traversal using nested for loop:");
        for (int row = 0; row < multiDArray.length; row++) {
            for (int col = 0; col < multiDArray[row].length; col++) {
                System.out.print(multiDArray[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Multi-dimensional array traversal using enhanced for loop:");
        for (int[] row : multiDArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
