import java.util.Scanner;

//Дано неотрицательное целое число. Найдите число десятков в его десятичной записи (то есть вторую справа цифру его десятичной записи).
//Входные данные
//Вводится неотрицательное целое число.
//Выходные данные
//Выведите ответ на задачу.

public class Task2943 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = (n % 100) / 10;
        System.out.println(sum);
    }
}
