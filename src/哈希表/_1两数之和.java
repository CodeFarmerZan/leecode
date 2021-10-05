package 哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName _1两数之和
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/13 10:09
 * Version 1.0
 **/
public class _1两数之和 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hashmap.containsKey(target - nums[i])){
                return new int[]{hashmap.get(target - nums[i]),i};
            }
            hashmap.put(nums[i],i);
        }
        return new int[0];
    }
}
