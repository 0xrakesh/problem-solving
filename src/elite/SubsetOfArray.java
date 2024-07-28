package elite;

import java.util.HashMap;

public class SubsetOfArray {
    public static void main(String[] args) {
        int[] a = {1,2,6};
        int[] b = {1, 2, 3, 4, 5};
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<a.length;i++)
            freq.put( a[i], freq.getOrDefault(a[i],0)+1 );
        for(int i=0;i<b.length;i++)
            freq.put( b[i], freq.getOrDefault(b[i],0)+1);

        boolean flag = true;
        for(int i=0;i<a.length;i++)
            if(freq.get(a[i]) < 2 ) flag = false;

        System.out.print(flag);
    }
}
