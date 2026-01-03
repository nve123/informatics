import java.util.Scanner;

//Задача №305. Билеты на метро - 2
//Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
//Билет на одну поездку в метро стоит 15 рублей, билет на 5 поездок стоит 70 рублей, билет на 10 поездок стоит 125 рублей, билет на 20 поездок стоит 230 рублей, билет на 60 поездок стоит 440 рублей.
//
//Пассажир планирует совершить n поездок. Определите, сколько билетов каждого вида он должен приобрести, чтобы суммарное количество оплаченных поездок было не меньше n, а общая стоимость приобретенных билетов – минимальна.
//
//Входные данные
//Дано одно число n - количество поездок.
//
//Выходные данные
//Выведите пять целых чисел, равные необходимому количеству билетов на 1, на 5, на 10, на 20, на 60 поездок. Если для какого-то данного n существует несколько способов приобретения билетов одинаковой стоимости, необходимо вывести ту комбинацию билетов, которая дает большее число поездок.
//
//Примеры
//Входные данные
//1
//Выходные

public class Task305 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sixtyRides = n / 60;
        int rem = n % 60;
        int twentyRides = rem / 20;
        rem %= 20;
        int tenRides = rem / 10;
        rem %= 10;
        int fiveRides = rem / 5;
        rem %= 5;
        int oneRide = rem;

        if (oneRide * 15 >= 70) {
            fiveRides++;
            oneRide = 0;
        }
        if (oneRide * 15 + fiveRides * 70 >= 125) {
            tenRides++;
            fiveRides = 0;
            oneRide = 0;
        }
        if (oneRide * 15 + fiveRides * 70 + tenRides * 125 >= 230) {
            twentyRides++;
            tenRides = 0;
            fiveRides = 0;
            oneRide = 0;
        }
        if (oneRide * 15 + fiveRides * 70 + tenRides * 125 + twentyRides * 230 >= 440) {
            sixtyRides++;
            twentyRides = 0;
            tenRides = 0;
            fiveRides = 0;
            oneRide = 0;
        }

        System.out.println(oneRide + " " + fiveRides + " " + tenRides + " " + twentyRides + " " + sixtyRides);
    }
}
