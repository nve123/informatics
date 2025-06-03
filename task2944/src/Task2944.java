import java.util.Scanner;

//Дано трехзначное число. Найдите сумму его цифр.
//Входные данные
//Вводится трехзначное число.
//Выходные данные
//Выведите ответ на задачу.

public class Task2944 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = (n / 100) + (n % 100 / 10) + (n % 10);
        System.out.println(sum);
    }
}
