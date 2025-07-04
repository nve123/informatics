import java.util.Scanner;

//Задача №293. Какое из чисел больше?
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//Входные данные
//Даны два целых числа, каждое записано в отдельной строке.
//
//Выходные данные
//Программа должна вывести число 1, если первое число больше второго, число 2, если второе больше первого, или число 0, если они равны.
//
//Примеры
//Входные данные
//1
//2
//Выходные данные
//2

public class Task263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            System.out.println(1);
        } else if (a == b) {
            System.out.println(0);
        } else {
            System.out.println(2);
        }
    }
}
