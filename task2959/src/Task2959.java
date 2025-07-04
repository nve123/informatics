import java.util.Scanner;

//Задача №2959. Знак числа
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//В математике функция sign(x) (знак числа) определена так:
//sign(x) = 1,   если x > 0,
//sign(x) = -1, если x < 0,
//sign(x) = 0,   если x = 0.
//
//Для данного числа x выведите значение sign(x).
//Входные данные
//Вводится число x.
//
//Выходные данные
//Выведите ответ на задачу.
//
//Примеры
//Входные данные
//179
//Выходные данные
//1

public class Task2959 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x > 0) {
            System.out.println(1);
        } else if (x == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
