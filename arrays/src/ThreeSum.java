import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] numbers = {-1,0,1,2,-1,-4};
        List<List<Integer>> subArray = new ArrayList<>();
        int n = numbers.length;
        int total=0;
        Arrays.sort(numbers);
        for(int i=0;i<n;i++) {
            if(i>0 && numbers[i] == numbers[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k) {
                int sum = numbers[i] + numbers[j] + numbers[k];
                if(sum==total) {
                    subArray.add(Arrays.asList(numbers[i], numbers[j],numbers[k]));
                    j++;
                    k--;
                }
                else if(sum<k) {
                    j++;
                    while(j<k && numbers[j] == numbers[j-1]) j++;
                }
                else {
                    k--;
                    while(j<k && numbers[k] == numbers[k+1]) k--;
                }


            }
        }
        System.out.println(subArray);
    }
}
