import java.util.Scanner;

public class Task345 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (num == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
