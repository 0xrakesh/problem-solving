import java.util.Scanner;

public class FrequencyOfIntegerNumber {
    public static int frequency(int[] input1) {
        int[] freq = new int[10];
        for(int num:input1) {
            while(num!=0) {
                freq[num%10]++;
                num/=10;
            }
        }
        int value = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<10;i++) {
            if(freq[i]>=max) {
                max = freq[i];
                value = i;
            }
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i=0;i<n;i++) numbers[i] = sc.nextInt();

        System.out.println(frequency(numbers));
    }
}
