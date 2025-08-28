import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class P10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<>();
            int count = 0;

            for (int j = 0; j < 20; j++) {
                int input = Integer.parseInt(st.nextToken());

                List<Integer> larger = list.stream().filter(v -> v > input).collect(Collectors.toList());
                if (!larger.isEmpty()) {
                    int targetIndex = list.indexOf(Collections.min(larger));
                    count += list.size() - targetIndex;
                    list.add(targetIndex, input);
                } else {
                    list.add(input);
                }
            }

            bw.write(num + " " + count + "\n");
        }

        bw.flush();
        bw.close();
    }
}
