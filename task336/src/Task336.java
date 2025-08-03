import java.util.Scanner;

//Задача №336. Цифра в числе
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода. Для хранения целых чисел необходимо использовать 4-байтовые переменные (например, тип longint в Free Pascal).
//
//
//
//
//
//
//
//Входные данные
//Вводятся 2 числа: x и d.
//
//Выходные данные
//Подсчитайте и выведите одно число - сколько раз встречается в записи натурального числа x цифра d.

public class Task336 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int c = 0;
        String str = Integer.toString(n);
        String str1 = Integer.toString(d);
        char str2 = str1.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str2) {
                c++;
            }
        }
        System.out.println(c);
    }
}
