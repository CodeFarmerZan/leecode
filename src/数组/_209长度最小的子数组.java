package 数组;

/**
 * @ClassName _209长度最小的子数组
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/2 20:20
 * Version 1.0
 **/
public class _209长度最小的子数组 {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while(high < nums.length){
            sum += nums[high];
            while (sum >= target) {
                min = Math.min(min, high - low + 1);
                sum -= nums[low++];
            }
            high++;
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}
