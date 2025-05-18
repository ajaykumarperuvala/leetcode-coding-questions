package Arrays;

public class MoveZeros {
    
    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap only if i and lastNonZeroFoundAt are different
                if (i != lastNonZeroFoundAt) {
                    int temp = nums[i];
                    nums[i] = nums[lastNonZeroFoundAt];
                    nums[lastNonZeroFoundAt] = temp;
                }
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
