

public class BinaryIterativeSearch implements Practice03Search {

    public String searchName() {
        return "Binary iterative search";
    }

    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int mid;
        while (low > high) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (mid > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}