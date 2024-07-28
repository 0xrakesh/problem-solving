package elite;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++) nums[i]=sc.nextInt();

        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<size;i++)
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);

        for(int i=0;i<size;i++)
            if(freq.get(nums[i])==1) System.out.print(nums[i]+" ");
    }
}
