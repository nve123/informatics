import java.util.Scanner;

//Задача №3074. Числа Фибоначчи
//
//
//Последовательность Фибоначчи определяется так:
//
//φ0=0,  φ1=1, ..., φn=φn-1+φn-2.
//
//По данному числу n определите n-е число Фибоначчи φn.
//
//Входные данные
//Вводится натуральное число n.
//
//Выходные данные
//Выведите ответ на задачу.
//
//Ввод	Вывод
//6
//8

public class Task3064 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int e = 2;
        int i = 2;
        if (n <= 1) {
            System.out.println(n);
            return;
        }
        while (i <= n) {
            e = a + b;
            a = b;
            b = e;
            i++;
        }
        System.out.print(e);
    }
}
