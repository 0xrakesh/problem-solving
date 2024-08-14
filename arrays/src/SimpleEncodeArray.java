import java.util.Scanner;

public class SimpleEncodeArray {
    static class Result{
        public final int value;
        public final int sum;
        Result(int v,int s) {
            this.value = v;
            this.sum = s;
        }
    }

    public static Result encodeArray(int[] input1, int input2) {
        int sum = input1[input2-1];
        for(int i=input2-2;i>=0;i--) {
            input1[i] = input1[i] - input1[i+1];
            sum+=input1[i];
        }
        return new Result(input1[0], sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        System.out.println(encodeArray(number,n));
    }
}
