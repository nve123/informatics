import java.util.Scanner;

//Задача №349. Уравнение по убыванию
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода. Для хранения целых чисел необходимо использовать 4-байтовые переменные (например, тип longint в Free Pascal).
//
//
//
//
//
//
//
//Входные данные
//Вводятся 4 числа: a, b, c и d.
//
//Выходные данные
//Найдите все целые решения уравнения ax3 + bx2 + cx + d = 0 на отрезке [0,1000] и выведите их в порядке убывания. Если на данном отрезке нет ни одного решения, то ничего выводить не нужно.

public class Task349 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        for (int x = 1000; x >= 0; x--) {
            if (d + (c * x) + (b * x * x) + (a * x * x * x) == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
