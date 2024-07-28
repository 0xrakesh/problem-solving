package elite;

public class FindDuplicate {
    public static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        // Phase 1: Find the intersection point
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Phase 2: Find the entrance to the cycle
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println("Duplicate element: " + findDuplicate(arr));
    }
}
