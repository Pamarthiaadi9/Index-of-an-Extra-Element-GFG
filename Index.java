/*Complete the function below*/
class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == n - 1 || arr1[mid] != arr2[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
