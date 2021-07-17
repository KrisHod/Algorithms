/***
 * Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters s.
 */
public class Test5 {
    public static void main(String[] args) {
        char [] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(reverseString(s));
    }

    public static char []reverseString(char[] s){
        if (s.length >=1){
            for (int i = 0; i<s.length/2; i++){
                char tem = s[i];
                s[i]=s[s.length-i-1];
                s[s.length-i-1] = tem;
            }
        }
        return s;
    }
}
