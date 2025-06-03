import java.util.Scanner;

//Дано двузначное число. Найдите число десятков в нем.
//Входные данные
//Вводится двухзначное число.
//Выходные данные
//Выведите ответ на задачу.

public class Task2942 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = n / 10;
        System.out.println(sum);
    }
}
