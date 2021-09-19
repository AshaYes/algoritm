package JavaRashTasks;

import java.util.Scanner;

public class SredneeChisloOnSystemCopy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = 1;
        int x = 1;
        int sum = 0;


        for (int i = 0; i<number; i++) {
            int[] arr1 = new int[x];

            System.out.println("Введите число: ");
            int chislo = s.nextInt();
//            arr1[x] = chislo;

            if(chislo==1) {
                break;
            }

            int y = x + 1;
            int[] arr2 = new int[y];
            System.arraycopy(arr1, 0, arr2, 0, arr1.length);


//            for ( int summ: arr2 ) {
//                sum = sum + arr2[chislo];
//                System.out.println("Сумма всех чисел = " + sum);
//            }

            System.out.println(arr2.length);
            number++;
            x++;
        }

    }

        }

