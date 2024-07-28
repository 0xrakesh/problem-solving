package elite;

public class ThirdSmallest {
    public static void main(String[] args) {
        int[] numb = {13,18,9,1,21};
        int first = Integer.MAX_VALUE;
        for (int num : numb) {
            first = Math.min(first, num);
        }
        int sec = Integer.MAX_VALUE;

        for (int num : numb) {
            if (num < sec && num != first) sec = num;
        }
        System.out.println(sec);
    }
}
