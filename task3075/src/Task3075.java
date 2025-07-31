import java.util.Scanner;

//Задача №3075. Номер числа Фибоначчи
//
//
//Дано натуральное число A > 1. Определите, каким по счету числом Фибоначчи оно является, то есть выведите такое число n, что φn=A. Если А не является числом Фибоначчи, выведите число -1.
//
//Входные данные
//Вводится натуральное число.
//
//Выходные данные
//Выведите ответ на задачу.
//
//Примеры
//Входные данные
//8
//Выходные данные
//6
//Входные данные
//10
//Выходные данные
//-1

public class Task3075 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f;
        int s = 1;
        if (n == 0) {
            System.out.println(1);
            return;
        }
        if (n == 1) {
            System.out.println(2);
            return;
        }
        int e = 1;
        int k = 2;
        while (n > e) {
            f = s;
            s = e;
            e = f + s;
            k++;
        }
        if (e == n) {
            System.out.println(k);
        } else {
            System.out.println(-1);
        }
    }
}