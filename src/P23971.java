import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");

        int H = Integer.parseInt(split[0]);
        int W = Integer.parseInt(split[1]);
        int N = Integer.parseInt(split[2]);
        int M = Integer.parseInt(split[3]);

        int colCount = W / (M + 1) + (W % (M + 1) > 0 ? 1 : 0);
        int rowCount = H / (N + 1) + (H % (N + 1) > 0 ? 1 : 0);

        System.out.println(colCount * rowCount);
    }
}
