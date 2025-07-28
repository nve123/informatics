import java.util.Scanner;

//Задача №3061. Двоичный логарифм
//
//
//По данному натуральному числу N выведите такое наименьшее целое число k, что 2k≥N.
//
//Операцией возведения в степень пользоваться нельзя!
//
//Входные данные
//Вводится натуральное число N.
//
//Выходные данные
//Выведите ответ на задачу.
//
//Примеры
//Входные данные
//7
//Выходные данные
//3

public class Task3061 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 0;
        int b = 1;
        while (b < n) {
            b *= 2;
            k++;
        }
        System.out.println(k);
    }
}
