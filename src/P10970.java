import java.io.*;
import java.util.*;

public class P10970 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][4];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (j == 0) map.put(arr[i][j], i);
            }
        }

        int[] myScore = arr[map.get(C)];
        int count = 1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int[] score = arr[entry.getValue()];
            if (score[1] > myScore[1]) count++;
            else if (score[2] > myScore[2]) count++;
            else if (score[3] > myScore[3]) count++;
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
