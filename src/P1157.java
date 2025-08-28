import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();

        int maxValue = 0;
        char maxChar = '?';
        boolean isDuplicate = false;

        for (Character c: s.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);

            int value = map.get(c);

            if (value > maxValue) {
                maxChar = c;
                maxValue = value;
                isDuplicate = false;
            } else if (value == maxValue) {
                isDuplicate = true;
            }
        }

        System.out.println(isDuplicate ? '?' : maxChar);
    }
}
