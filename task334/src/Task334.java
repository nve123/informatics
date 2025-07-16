import java.util.Scanner;

//Задача №334. Остаток
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
//Выведите все числа на отрезке от a до b, дающие остаток c при делении на d. Если таких чисел не существует, то ничего выводить не нужно.
//
//Примеры
//Входные данные
//2
//5
//0
//2
//Выходные данные
//2 4

public class Task334 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.print(i + " ");
            }
        }
    }
}
