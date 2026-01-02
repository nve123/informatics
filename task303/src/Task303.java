import java.util.Scanner;

//Задача №303. Коровы
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//По данному числу n закончите фразу "На лугу пасется..." одним из возможных продолжений: "n коров", "n корова", "n коровы", правильно склоняя слово "корова".
//
//Входные данные
//Дано число n (n<100).
//
//Выходные данные
//Программа должна вывести введенное число n и одно из слов (на латинице): korov, korova или korovy, например, 1 korova, 2 korovy, 5 korov. Между числом и словом должен стоять ровно один пробел.
//
//Примеры
//Входные данные
//1
//Выходные данные
//1 korova

public class Task303 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int korova = in.nextInt();
        String cows;
        if (korova % 100 >= 11 && korova % 100 <= 19) {
            cows = "korov";
        } else {
            int lastNomber = korova % 10;
            if (lastNomber == 1) {
                cows = "korova";
            } else if (lastNomber >= 2 && lastNomber <= 4) {
                cows = "korovy";
            } else {
                cows = "korov";
            }
        }
        System.out.println(korova + " " + cows);
    }
}