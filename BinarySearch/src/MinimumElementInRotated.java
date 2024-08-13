public class MinimumElementInRotated {
    public static int searchMin(int[] elements) {
        int ans = Integer.MAX_VALUE;
        int n = elements.length, low = 0, high = n-1;
        while(low<=high) {
            int mid = (low+high) / 2;
            if(elements[low] <= elements[mid]) {
                ans = Math.min(ans,elements[low]);
                low = mid+1;
            }
            else {
                ans = Math.min(ans,elements[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] elements = {4,5,6,7,0,1,2,3};
        System.out.println(searchMin(elements));
    }
}
