package Arrays;

public class FinalPivotIndex {
    
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array to find the pivot index
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Found the pivot index
            }
            leftSum += nums[i]; // Update left sum
        }

        return -1; // No pivot index found
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums)); // Output: 3
    }
}
