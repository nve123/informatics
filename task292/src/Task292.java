import java.util.Scanner;

//Задача №292. Максимум из двух чисел
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//Входные данные
//Даны два целых числа, каждое число записано в отдельной строке.
//
//Выходные данные
//Выведите наибольшее из данных чисел.
//
//Примеры
//Входные данные
//1
//2
//Выходные данные
//2

public class Task292 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
