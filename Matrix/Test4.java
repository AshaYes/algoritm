package Matrix;

import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {

        int random1 = (int) (Math.random() * 100);
        int random2 = (int) (Math.random() * 100);
        int random3 = (int) (Math.random() * 100);
        int random4 = (int) (Math.random() * 100);
        int random5 = (int) (Math.random() * 100);
        int random6 = (int) (Math.random() * 100);
        int random7 = (int) (Math.random() * 100);
        int random8 = (int) (Math.random() * 100);
        int random9 = (int) (Math.random() * 100);
        int random10 = (int) (Math.random() * 100);
        int random11 = (int) (Math.random() * 100);
        int random12 = (int) (Math.random() * 100);
        int random13 = (int) (Math.random() * 100);
        int random14 = (int) (Math.random() * 100);
        int random15 = (int) (Math.random() * 100);
        int random16 = (int) (Math.random() * 100);
        int random17 = (int) (Math.random() * 100);
        int random18 = (int) (Math.random() * 100);
        int random19 = (int) (Math.random() * 100);
        int random20 = (int) (Math.random() * 100);
        int random21 = (int) (Math.random() * 100);
        int random22 = (int) (Math.random() * 100);
        int random23 = (int) (Math.random() * 100);
        int random24 = (int) (Math.random() * 100);
        int random25 = (int) (Math.random() * 100);


        int[][] matrix = {{random1, random2, random3, random4, random5},
                {random6, random7, random8, random9, random10},
                {random11, random12, random13, random14, random15},
                {random16, random17, random18, random19, random20},
                {random21, random22, random23, random24, random25}};


        System.out.println("Исходный массив: ");

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {

                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();

            System.out.println("Сортированный масив");

        }
    }
}
