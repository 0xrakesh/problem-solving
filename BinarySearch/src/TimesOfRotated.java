public class TimesOfRotated {
    public static int searchRotation(int[] elements) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        int n = elements.length, low = 0, high = n-1;
        while(low<=high) {
            int mid = (low+high) / 2;

            if(elements[low]<=elements[high]) {
                if(elements[low]<min) {
                    index = low;
                    break;
                }
            }

            if(elements[low] <= elements[mid]) {
                if(elements[low] < min) {
                    min = elements[low];
                    index = low;
                }
                low = mid+1;
            }
            else {
                if(elements[mid]<=elements[high]) {
                    if(elements[mid]<min) {
                        min = elements[mid];
                        index = mid;
                    }
                }
                high = mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] elements = {4,5,6,0,1,2,3};
        System.out.println(searchRotation(elements));
    }
}
