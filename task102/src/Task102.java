import java.util.Scanner;

//Задача №102. Проверить, является ли символ цифрой
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//Напишите функцию boolean IsDigit(char c) (Java), function IsDigit(c:char):boolean (Pascal), bool IsDigit(unsigned char c) (C/C++), определяющую, является ли данный символ цифрой или нет.
//
//Естественно, программа должна считывать данные, вызывать эту функцию и выдавать ответ.
//
//Входные данные
//Задан единственный символ c.
//
//Выходные данные
//Необходимо вывести  строку yes, если символ является цифрой, и строку no в противном случае.
//
//Примеры
//Входные данные
//c
//Выходные данные
//no
//Входные данные
//2
//Выходные данные
//yes

public class Task102 {

    public static boolean isDigit(char c) {
        return Character.isDigit(c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);

        if (isDigit(c)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
