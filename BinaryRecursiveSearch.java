

public class BinaryRecursiveSearch implements Practice03Search {

    public String searchName() {
        return "Binary recursive search";
    }

    public int search(int[] arr, int target) {
       return recSearch(arr, target, 0, arr.length-1);
    }

    private int recSearch(int[] arr, int target, int low, int high) {
        int mid;
        if (low > high) {
            return -1;
        } else {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid -1;
                return recSearch(arr, target, low, high);
            } else {
                low = mid + 1;
                return recSearch(arr, target, low, high);
            }
        }
    }
}