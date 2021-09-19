package Matrix;

public class Test5 {
    public static void main(String[] args) {
        int[][] arr = makeRandomArr(5, 7);

        System.out.println("RANDOM ARRAY");
        prettyPrintArr(arr);
        System.out.println();

        sortByLineSum(arr);

        System.out.println("SORTED ARRAY");
        prettyPrintArr(arr);
        System.out.println();
    }

    private static int[][] makeRandomArr(int dimension, int bound) {
        int[][] result = new int[dimension][dimension];
        java.util.Random rnd = new java.util.Random();
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = rnd.nextInt(bound);
            }
        }
        return result;
    }

    private static void sortByLineSum(int[][] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if (calcLineSum(arr[j]) > calcLineSum(arr[j + 1])) {
                    int[] buffLine = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffLine;
                }
            }
        }
    }

    private static int calcLineSum(int[] line) {
        int result = 0;
        for(int val : line) {
            result += val;
        }
        return result;
    }

    private static void prettyPrintArr(int[][] arr) {
        int maxColWidth = 0;
        int maxSumColWidth = 0;
        for (int[] line : arr) {
            for (int val : line) {
                int colWidth = String.format("%s", val).length();
                if (colWidth > maxColWidth) {
                    maxColWidth = colWidth;
                }

                int sumColWidth = String.format("%s", calcLineSum(line)).length();
                if(sumColWidth > maxSumColWidth) {
                    maxSumColWidth = sumColWidth;
                }
            }
        }

        String valFormat = "%" + (maxColWidth + 2) + "s";
        String sumFormat = "%" + (maxSumColWidth + 6) + "s";
        for (int[] line : arr) {
            for (int val : line) {
                System.out.format(valFormat, val);
            }
            System.out.format(sumFormat, calcLineSum(line));
            System.out.println();
        }
    }
}
