package Matrix;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {

        int x = (int) (Math.random() * 8 + 3);
        /*"Я не люблю давать товарищам советы,
         * Но знаю я разбой у них в чести.
         * Вот только что я прочитал про это:
         * не меньше трёх не больше десяти!" :-)
         */
        int[][] arrayTest = new int[x][]; //объявим массив из Х строк

        //длина будущих строк от единицы до десяти
        for (int i = 0; i < x; ++i) {
            arrayTest[i] = new int[(int) (Math.random() * 10 + 1)];
        }
        //полюбуемся, чего у нас получилось
        System.out.println("Исходный массив: ");
        //после заполнения массива случайными числами
        for (int i = 0; i < x; ++i) {
            for (int j = 0; j < arrayTest[i].length; ++j) {
                arrayTest[i][j] = (int) (Math.random() * 50 - 5);
                System.out.print(arrayTest[i][j] + "\t");
            }
            System.out.println();
        }

        //собственно сама сортировка
        int temp = 0;
        //в реальности можно вместо Х вставить arrayTest.length
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < arrayTest[i].length; j++) {
                for (int k = 0; k < x; k++) {
                    for (int n = 0; n < arrayTest[k].length; n++) {
                        if (arrayTest[k][n] > arrayTest[i][j]) {
                            temp = arrayTest[k][n];
                            arrayTest[k][n] = arrayTest[i][j];
                            arrayTest[i][j] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("\nУпорядоченный массив: ");
        for (int i = 0; i < x; ++i) {
            for (int j = 0; j < arrayTest[i].length; ++j) {
                System.out.print(arrayTest[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

