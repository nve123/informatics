import java.util.Scanner;

//Задача №3058. Минимальный делитель
//
//
//Дано целое число N
//, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.
//
//Входные данные
//Вводится натуральное число \(2 \le N \ 1000).
//
//Выходные данные
//Выведите ответ на задачу.
//
//Примеры
//Входные данные
//15
//Выходные данные
//3

public class Task3058 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 2;
        while (n % x != 0) {
            x += 1;
        }
        System.out.println(x);
    }
}
