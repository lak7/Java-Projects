import java.util.Arrays;

public class playground1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));

    }

    public static int[] runningSum(int[] nums) {
        int temp =0;

        for(int i = 0; i< nums.length; i++){
            int t = nums[i];
            nums[i] += temp;
            temp += t;
        }
        return nums;
    }
}
