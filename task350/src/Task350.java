import java.util.Scanner;

//Задача №350. Количество решений
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода. Для хранения целых чисел необходимо использовать 4-байтовые переменные (например, тип longint в Free Pascal).
//
//
//
//
//
//
//
//Входные данные
//Вводятся 5 чисел: a, b, c, d и e.
//
//Выходные данные
//Найдите все целые решения уравнения ( ax3 + bx2 + cx + d ) / ( x - e ) = 0 на отрезке [0,1000] и выведите их количество.
//
//Примеры
//Входные данные
//2
//4
//9
//1
//5
//Выходные данные
//0

public class Task350 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();
        int count = 0;
        for (int x = 0; x < 1001; x++) {
            if (x - e != 0) {
                if (((a * x * x * x) + (b * x * x) + (c * x) + d) == 0) {
                    count ++;
                }
            }
        }
        System.out.print(count);
    }
}
