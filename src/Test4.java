import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(MathChallenge(Integer.parseInt(s.nextLine())));
    }

    public static int MathChallenge(int num) {
        int count = 0;
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
            count += 1;
        }
        return count;
    }

}


