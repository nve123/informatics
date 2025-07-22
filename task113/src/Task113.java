import java.util.Scanner;

//Выведите все точные квадраты натуральных чисел, не превосходящие данного числа N.
//
//Входные данные
//Задано единственное целое число N
//
//Выходные данные
//Необходимо вывести  все точные квадраты натуральных чисел, не превосходящие данного числа N.
//
//Примеры
//Входные данные
//15
//Выходные данные
//1
//4
//9

public class Task113 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while (i * i <= n) {
            System.out.println(i * i);
            i++;
        }
    }
}
