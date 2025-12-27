import java.util.Scanner;

//Задача №301. Квадратное уравнение
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//Даны действительные числа a, b, c. Найдите все решения квадратного уравнения ax2 + bx + c = 0.
//
//Входные данные
//Даны три действительных числа, a не равно 0.
//
//Выходные данные
//Выведите два действительных числа в любом порядке, если уравнение имеет два корня, одно действительное число – при наличии одного корня. При отсутствии действительных корней ничего выводить не нужно.
//
//Примеры
//Входные данные
//1
//0
//0
//Выходные данные
//0

public class Task301 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double disk = b * b - 4 * a * c;
        if (disk >= 0) {
            if (disk > 0) {
                double d = Math.sqrt(disk);
                double x1 = (-b - d) / (2 * a);
                double x2 = (-b + d) / (2 * a);
                System.out.print(x1 + " " + x2);
                return;
            } else {
                double x = -b / (2 * a);
                System.out.println(x);
                return;
            }
        }
    }
}
