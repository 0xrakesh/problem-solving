package array;

public class LongestConsequence {
    public static int optimal(int[] numb,int length) {
        int data = numb[0];
        int sequence = 1;
        int maxLen = Integer.MIN_VALUE;
        for(int i=1;i<length;i++) {
            if( data + 1 == numb[i] ) sequence++;
            else sequence = 1;
            data = numb[i];
            maxLen = Math.max(sequence,maxLen);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] numb = {100,200,1,2,3,7,12,13,14,15,8,9,10};
        int length = numb.length;
        System.out.println(optimal(numb,length));
    }
}
