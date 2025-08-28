import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bf;

        while ((bf = br.readLine()) != null) {
            String[] split = bf.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int c = Integer.parseInt(split[2]);

            int max = Math.max(a, Math.max(b, c));
            int otherSum = a + b + c - max;

            if (a == 0 && b == 0 && c == 0) break;

            if (a == b && b == c) {
                System.out.println("Equilateral");
                continue;
            } else if (max >= otherSum) {
                System.out.println("Invalid");
                continue;
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
                continue;
            }
            System.out.println("Scalene");
        }
    }
}
