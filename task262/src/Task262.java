import java.util.Scanner;

//Задача №262. Сдача
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//Товар стоит a руб. b коп. За него заплатили c руб. d коп. Сколько сдачи требуется получить?
//
//Входные данные
//Вводятся 4 числа: a, b, c и d.
//
//Выходные данные
//Необходимо вывести 2 числа: e и f, число рублей и копеек, соответственно.
//
//Примеры
//Входные данные
//5
//5
//6
//5
//Выходные данные
//1 0
//Входные данные
//2
//17
//2
//18
//Выходные данные
//0 1

public class Task262 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = (c - a);
        int f = (d - b);
        int k = c - a - 1;
        int m = (d + 100) - b;
        if (c >= a && d >= b) {
            System.out.print(e + " " + f);
        } else {
            System.out.print(k + " " + m);
        }
    }
}
