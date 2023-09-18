import java.util.*;

public class playground1 {

    public static void main(String[] args) {

        int[] arr = {4,1,-1,2,-1,2,3};
        int[] aa = topKFrequent(arr, 2);
        System.out.println(Arrays.toString(aa));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] rtnArr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        int[] tmpArr = new int[map.size()];
        int tmp = 0;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            tmpArr[tmp] = entry.getValue();
            tmp++;
        }

        tmp = 0;
        Arrays.sort(tmpArr);

        for(int i = 0; i < tmpArr.length / 2; i++) {
            // Swapping the elements
            int j = tmpArr[i];
            tmpArr[i] = tmpArr[tmpArr.length - i - 1];
            tmpArr[tmpArr.length - i - 1] = j;
        }

        for(int i = 0; i< k; i++){
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() == tmpArr[i]){
                    rtnArr[i] = entry.getKey();
                    entry.setValue(0);
                    break;
                }
            }
        }
        return rtnArr;

    }

}
