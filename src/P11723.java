import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P11723 {
    private static final Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String c = st.nextToken();
            int v = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()) : 0;

            switch (c) {
                case "add":
                    set.add(v);
                    break;
                case "remove":
                    set.remove(v);
                    break;
                case "check":
                    bw.write(set.contains(v) ? "1\n" : "0\n");
                    break;
                case "toggle":
                    if (set.contains(v)) set.remove(v);
                    else set.add(v);
                    break;
                case "all":
                    set.addAll(IntStream.range(1, 21).boxed().collect(Collectors.toSet()));
                    break;
                case "empty":
                    set.clear();
                    break;
                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
