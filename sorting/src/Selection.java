import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] numbs = {13,46,24,52,20,9};
        int n = numbs.length-1;
        for(int i=0;i<n;i++) {
            int min = i;
            for(int j=i+1;j<=n;j++) {
                if(numbs[j] < numbs[min]) min = j;
            }

            int temp = numbs[i];
            numbs[i] = numbs[min];
            numbs[min] = temp;
        }

        System.out.println(Arrays.toString(numbs));
    }
}
