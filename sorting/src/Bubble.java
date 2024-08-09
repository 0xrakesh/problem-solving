import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] numbers = {13,46,24,52,20,9};
        int n = numbers.length-1;
        for(int i=n;i>=0;i--) {
            for(int j=0;j<=i-1;j++) {
                if(numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
