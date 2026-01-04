import java.util.Scanner;

//Задача №103. Перевести символ в верхний регистр
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//Напишите функцию unsigned char ToUpper(unsigned char c) (C/C++), function ToUpper(c:char):char (Pascal), которая переводит данный символ в верхний регистр.
//
//Входные данные
//Задан один символ c.
//
//Выходные данные
//Если символ является строчной буквой латинского алфавита (то есть буквой от a до z), выведите вместо него аналогичную заглавную букву, иначе выведите тот же самый символ (такая операция называется "перевод в верхний регистр").
//
//Примеры
//Входные данные
//e
//Выходные данные
//E
//Входные данные
//B
//Выходные данные
//B

public class Task103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        if (c >= 'a' && c <= 'z') {
            char result = (char) (c - ('a' - 'A'));
            System.out.println(result);
        } else {
            System.out.println(c);
        }
    }
}
