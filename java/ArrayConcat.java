import java.util.Arrays;

public class ArrayConcat {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1};
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[nums.length + i] = nums[i];
        }
        System.out.println(Arrays.toString(result));
        //System.err.println(result.toString());
    }
}
