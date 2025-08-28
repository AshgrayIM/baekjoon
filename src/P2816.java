import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P2816 {
    private static final List<String> channel = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            channel.add(br.readLine());
        }
        final String k1 = "KBS1";
        final String k2 = "KBS2";
        int cursor = 0;

        while (channel.indexOf(k1) > cursor + 1) {
            swap(cursor, ++cursor);
            System.out.printf("%d", 3);
        }
        if (channel.indexOf(k1) == 0 && channel.indexOf(k2) == 1) return;

        cursor++;
        System.out.printf("%d", 1);

        while (channel.indexOf(k1) != 0) {
            swap(cursor, --cursor);
            System.out.printf("%d", 4);
        }
        if (channel.indexOf(k2) == 1) return;

        cursor++;
        System.out.printf("%d", 1);

        while (channel.indexOf(k2) != cursor + 1) {
            swap(cursor, ++cursor);
            System.out.printf("%d", 3);
        }
        if (channel.indexOf(k2) == 1) return;

        cursor++;
        System.out.printf("%d", 1);

        while (channel.indexOf(k2) != 1) {
            swap(cursor, --cursor);
            System.out.printf("%d", 4);
        }
    }

    private static void swap(int i, int j) {
        String temp = channel.get(i);
        channel.set(i, channel.get(j));
        channel.set(j, temp);
    }
}
