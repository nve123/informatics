import java.util.Scanner;

//Задача №347. Ноль или не ноль
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода. Для хранения целых чисел необходимо использовать 4-байтовые переменные (например, тип longint в Free Pascal).
//
//
//
//
//
//
//
//Проверьте, есть ли среди данных N чисел нули.
//
//Входные данные
//Вводится число N, а затем N чисел.
//
//Выходные данные
//Выведите YES, если среди введенных чисел есть хотя бы один нуль, или NO в противном случае.

public class Task347 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (num == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}


// не переходить!!!!!!! https://www.youtube.com/watch?v=dQw4w9WgXcQ