import java.util.Scanner;

//Задача №295. Существует ли треугольник?
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//Входные данные
//Даны три натуральных числа a, b, c, записанные в отдельных строках. Определите, существует ли невырожденный треугольник с такими сторонами.
//
//Выходные данные
//Если треугольник существует, выведите строку YES, иначе выведите строку NO.
//
//Примеры
//Входные данные
//3
//4
//5
//Выходные данные
//YES

public class Task295 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a + b > c && a + c > b && c + b > a){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
