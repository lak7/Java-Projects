import java.util.Arrays;

public class Brain {
    public static void main(String[] args){

        int[] arr = {1,1};

        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {



        int len = nums.length;
        Arrays.sort(nums);
        int temp = 0;

        if(len == 1) return nums[0];

        for(int i = 0; i< len-1; i++){
            if(nums[i] == nums[i+1]){
                temp++;
            }
            else{
                temp = 0;
            }

            if(temp >= len/2){
                return nums[i];
            }
        }

        return 0;
    }
}