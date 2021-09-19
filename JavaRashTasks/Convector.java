package JavaRashTasks;

import java.util.Scanner;

public class Convector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество градусов по шкале цельсия");
        double celsiy= scanner.nextInt();
        System.out.println("Переводим в фаренгейты...");
        double farengeit = (celsiy*9/5)+32;
        System.out.println(farengeit);
    }
}
