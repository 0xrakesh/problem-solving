import java.util.ArrayList;

public class MergeSort {
    public static void mergeSort(int[] numbers, int low, int high) {
        // Base case
        if(low>=high) return;
        int mid = (low+high) / 2;
        mergeSort(numbers,low,mid);
        mergeSort(numbers,mid+1,high);
        merge(numbers,low,mid,high);
    }

    public static void merge(int[] numbers, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high) {
            if(numbers[left] < numbers[right]) temp.add(numbers[left++]);
            else temp.add(numbers[right++]);
        }
        while(left<=mid) temp.add(numbers[left++]);
        while(right<=high) temp.add(numbers[right++]);

        for(int i=low;i<=high;i++)
            numbers[i] = temp.get(i-low);

    }

    public static void main(String[] args) {
        int[] numbers = {3,1,2,5,4};
        mergeSort(numbers,0, numbers.length-1);
        for (int number : numbers) System.out.print(number + " ");
    }
}
