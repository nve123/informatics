import java.util.Scanner;

//Задача №254. Ладья
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
//
//Входные данные
//Вводятся четыре числа: координаты ладьи (два числа) и координаты другой фигуры (два числа), каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
//
//Выходные данные
//Требуется вывести слово YES, если ладья сможет побить фигуру за 1 ход и NO - в противном случае.
//
//Примеры
//Входные данные
//1
//1
//2
//2
//Выходные данные
//NO
//Входные данные
//1
//1
//2
//1
//Выходные данные
//YES

public class Task254 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if (a == c || b == d) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
