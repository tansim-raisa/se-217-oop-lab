public class TwoDArrayDemo {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        int[][] directMatrix = {
            {10, 20, 30},
            {40, 50, 60}
        };
        System.out.println("Printing 3x3 Matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPrinting 2x3 Matrix:");
        for (int row = 0; row < directMatrix.length; row++) {
            for (int col = 0; col < directMatrix[row].length; col++) {
                System.out.print(directMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
