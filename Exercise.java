
import java.util.Arrays;

public class Exercise {

    public int[] twoSum(int[] nums, int target) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    System.out.println(nums[i] + "," + nums[j]);
                    System.out.println(Arrays.toString(new int[] { i, j }));
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        Exercise exercise = new Exercise();
        exercise.twoSum(nums, 9);
        int[] num = new int[]{3, 2, 4};
        exercise.twoSum(num, 6);


    }

}
