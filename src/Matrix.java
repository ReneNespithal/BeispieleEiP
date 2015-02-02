public class Matrix {

    static int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
    };

    public static boolean gleich(int[] a1, int[] a2) {
        boolean eq = false;
        for (int pos = 0; pos < a1.length; pos++) {
            eq = (a1[pos] == a2[pos]);
            if (!eq) break;
        }
        return eq;
    }

    public static boolean enthaeltZeile(int[][] matrix, int[] zeile) {
        boolean eq = false;
        for (int posRow = 0; posRow < matrix.length; posRow++) {
            int[] testRow = new int[matrix[posRow].length];
            for (int posCol = 0; posCol < matrix[posRow].length; posCol++) {
                testRow[posCol] = matrix[posRow][posCol];
            }
            eq = gleich(testRow, zeile);
            if (eq) break;
        }
        return eq;
    }

    public static boolean enthaeltSpalte(int[][] matrix, int[] spalte) {
        boolean eq = true;
        for (int posCol = 0; posCol < matrix[0].length; posCol++) {
            for (int posRow = 0; posRow < spalte.length; posRow++) {
                int[] testMatrix = {0};
                int[] testSpalte = {0};
                testMatrix[0] = matrix[posRow][posCol];
                testSpalte[0] = spalte[posRow];
                eq = gleich(testMatrix, testSpalte);
                if (!eq) break;
            }
            if (eq) break;
        }
        return eq;
    }

    public static int[][] transponieren(int[][] matrix) {
        int[][] transMatrix = new int[matrix[0].length][matrix.length];
        for (int posCol = 0; posCol < matrix[0].length; posCol++) {
            for (int posRow = 0; posRow < matrix.length; posRow++) {
                transMatrix[posCol][posRow] = matrix[posRow][posCol];
            }
        }
        return transMatrix;
    }

    public static void main(String[] args) {
        System.out.println("gleich({1,2,3}, {1,2,3}): "
                + gleich(new int[]{1, 2, 3}, new int[]{1, 2, 3})); // true
        System.out.println("enthaeltZeile(matrix, {4,5,6}): "
                + enthaeltZeile(matrix, new int[]{4, 5, 6})); // true
        System.out.println("enthaeltSpalte(matrix, {1,4,7,10}): "
                + enthaeltSpalte(matrix, new int[]{1, 4, 7, 10})); // true
        int[][] printMatrix = transponieren(matrix);
        System.out.println("transponieren(matrix): ");
        for (int i = 0; i < printMatrix.length; i++) {
            for (int j = 0; j < printMatrix[0].length; j++) {
                System.out.print(printMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
