import java.util.Scanner;

public class P2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 1) {
            System.out.println(1);
            return;
        }

        int count = 2;
        int dif = 5;
        int b = 7;

        while (N > b) {
            count++;
            dif += 6;
            b += dif + 1;
        }

        System.out.println(count);
    }
}
