import java.util.Scanner;

//Задача №296. Количество равных из трех
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//Входные данные
//Даны три целых числа, записанных в отдельных строках. Определите, сколько среди них совпадающих.
//
//Выходные данные
//Программа должна вывести одно из чисел: 3 (если все совпадают), 2 (если два совпадают) или 0 (если все числа различны).
//
//Примеры
//Входные данные
//1
//2
//2
//Выходные данные
//2

public class Task296 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
         if (c == b && c == a) {
            System.out.println(3);
            return;
        } else if (c == b || c == a || a == b){
            System.out.println(2);
            return;
        }  else {
            System.out.println(0);
        }
    }
}
