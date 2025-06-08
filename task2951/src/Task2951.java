import java.util.Scanner;

//Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
//
//Входные данные
//Программа получает на вход три числа: a, b, n.
//
//Выходные данные
//Программа должна вывести два числа: стоимость покупки в рублях и копейках.

public class Task2951 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int cost = n * (100 * a + b);
        System.out.println(cost / 100 + " " + cost % 100);
    }
}
