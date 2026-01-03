import java.util.Scanner;

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
