package JavaRashTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class SredneeChislo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = 1;
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < y; i++) {
            System.out.println("Введите число...");
            int x = s.nextInt();
            list.add(x);
            if (x == 1) {
                break;
            }
            System.out.println("Сумма всех чисел = " + summ(list));
            System.out.println("Среднее арфметическое всех чисел = " + sredneeCheslo(list));

            y++;

        }
    }

    public static int summ (ArrayList<Integer> list) {
        int sum = 0;
        for (int g = 0; g < list.size(); g++) {
            sum = sum + list.get(g);
        }
        return sum;
    }

    public static int sredneeCheslo (ArrayList<Integer> list) {
        int w = summ(list)/ list.size();
        return w;
    }
}