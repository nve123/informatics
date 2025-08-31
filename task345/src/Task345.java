import java.util.Scanner;

//Задача №345. Нули
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода. Для хранения целых чисел необходимо использовать 4-байтовые переменные (например, тип longint в Free Pascal).
//
//
//
//
//
//
//
//Входные данные
//Вводится число N, а затем N чисел.
//
//Выходные данные
//Подсчитайте и выведите, сколько среди данных N чисел нулей.
//
//Примеры
//Входные данные
//3
//1
//2
//3
//Выходные данные
//0

public class Task345 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (num == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
