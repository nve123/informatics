import java.util.Scanner;

//Задача №260. Уравнение
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//Решить в целых числах уравнение ax + b = 0.
//
//Входные данные
//Вводятся 2 целых числа: a и b.
//
//Выходные данные
//Необходимо вывести все решения, если их число конечно, “NO” (без кавычек), если решений нет, и “INF” (без кавычек), если решений бесконечно много.

public class Task260 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int x = 0;
        if (a == 0) {
            if (b == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            if (b % a == 0) {
                x = -b / a;
                System.out.println(x);
            } else {

                System.out.println("NO");
            }
        }

    }
}
