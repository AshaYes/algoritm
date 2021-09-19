package Matrix;

public class Test2 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 5, 4, 45, 12 },
                { 7, 5, 8,  85 },
        };

        for ( int r = 0; r < matrix.length; ++r ) {
            for ( int c = 0; c < matrix[r].length; ++c ) {
                int lastC = c + 1;
                for ( int lastR = r; lastR < matrix.length; ++lastR ) {
                    while ( lastC < matrix[lastR].length) {
                        if ( matrix[lastR][lastC] < matrix[r][c] ) {
                            int tmp = matrix[r][c];
                            matrix[r][c] = matrix[lastR][lastC];
                            matrix[lastR][lastC] = tmp;
                        }
                        ++lastC;
                    }
                    lastC = 0;
                }
            }
        }

        for ( int i = 0; i < matrix.length; ++i )
            System.out.println(java.util.Arrays.toString(matrix[i]));
    }

}

