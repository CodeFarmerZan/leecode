package 数组;

/**
 * @ClassName _977有序数组的平方
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/2 19:13
 * Version 1.0
 **/
public class _977有序数组的平方 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int low = 0;
        int high = nums.length-1;
        int index = nums.length-1;
        while(low<=high){
            if(nums[low]*nums[low] > nums[high]*nums[high]){
                result[index] = nums[low]*nums[low];
                index--;
                low++;
            }else{
                result[index] = nums[high]*nums[high];
                index--;
                high--;
            }
        }
        return result;
    }
}
