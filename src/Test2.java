
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(missingWords("I am using HackerRank to improve programming", "am HackerRank to improve"));
    }

    public static List<String> missingWords(String s, String t) {
        String[] s1 = s.split(" ");
        String[] s2 = t.split(" ");
        int sz = s1.length - s2.length;
        String[] missing_str = new String[sz];
        int c = 0;
        for (String value : s1) {
            int flag = 0;
            for (String item : s2) {
                if (value.equals(item)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                missing_str[c++] = value;
            }
        }
        return Arrays.asList(missing_str.clone());
    }
}
