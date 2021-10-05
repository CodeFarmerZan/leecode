package 哈希表;

import java.util.*;

/**
 * @ClassName _18四数之和
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/16 19:23
 * Version 1.0
 **/
public class _18四数之和 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,-1,0,0,1,2};
        List<List<Integer>> lists = fourSum(nums, 0);
        System.out.println(lists);
        Map a = new HashMap();
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        for(int i = 0; i < len; i++){
            if(i > 0&&nums[i] == nums[i-1]){//去重
                continue;
            }
            for(int j = i + 1; j < len - 1; j++){
                if(j > i + 1&&nums[j] == nums[j-1]){//去重
                    continue;
                }
                int newtarget = target-nums[i]-nums[j];
                int left = j+1;
                int right = len-1;
                while(left < right){
                    if(nums[left] + nums[right] == newtarget){
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        lists.add(list);
                        while(left<right&&nums[right-1]==nums[right]){right--;}//去重
                        while(left<right&&nums[left+1]==nums[left]){left++;}//去重
                        right--;
                        left++;

                    }else if(nums[left] + nums[right] > newtarget){
                        right--;
                    }else{
                        left++;
                    }
                }

            }
        }
        return lists;
    }
}
