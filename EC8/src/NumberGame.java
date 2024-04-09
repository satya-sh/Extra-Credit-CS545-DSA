import java.util.Arrays;

public class NumberGame {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);

        int[] arr = new int[nums.length];

        for (int i = 0, j = 0; i < nums.length; i += 2, j += 2) {
            if (i + 1 < nums.length) {
                arr[j] = nums[i + 1];
            }
            arr[j + 1] = nums[i];
        }

        return arr;
    }
}
