import java.util.Scanner;

//Задача №346. Подсчет чисел
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода. Для хранения целых чисел необходимо использовать 4-байтовые переменные (например, тип longint в Free Pascal).
//
//
//
//
//
//
//
//Подсчитайте, сколько среди данных N чисел нулей, положительных чисел, отрицательных чисел.
//
//Входные данные
//Вводится число N, а затем N целых чисел.
//
//Выходные данные
//Необходимо вывести сначала число нулей, затем число положительных и отрицательных чисел.
//
//Примеры
//Входные данные
//5
//28
//0
//0
//0
//0
//Выходные данные
//4 1 0

public class Task346 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int countZero = 0;
        int countNeg = 0;
        int countPoz = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (num == 0) {
                countZero++;
            } else if (num > 0) {
                countPoz++;
            } else if (num < 0) {
                countNeg++;
            }
        }
        System.out.println(countZero + " " + countPoz + " " + countNeg);
    }
}
