import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] numbers = {13,46,24,52,20,9};
        int n = numbers.length;
        for(int i=0;i<n;i++) {
            int j = i;
            while(j>0 && numbers[j] < numbers[j-1]) {
                int temp = numbers[j];
                numbers[j] = numbers[j-1];
                numbers[j-1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
