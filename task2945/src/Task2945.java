import java.util.Scanner;

//Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы.
//Входные данные
//Вводится натуральное число.
//Выходные данные
//Выведите ответ на задачу.
//Текст он принивает за if так что его надо убирать

public class Task2945 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int num = v + 2 - v % 2;
        System.out.println(num);
    }
}
