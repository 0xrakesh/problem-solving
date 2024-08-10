public class FirstOccurrence {
    public static int search(int[] numbers, int k) {
        int index = -1,n = numbers.length;
        int low = 0, high = n-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(numbers[mid] == k) index = mid;
            if(numbers[mid] >= k) high = mid-1;
            else low = mid+1;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] numbers = {3,4,13,13,13,20,40};
        int k = 13;
        System.out.println(search(numbers,k));
    }
}
