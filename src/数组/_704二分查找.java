package 数组;

/**
 * @ClassName _704二分查找
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/5/30 18:51
 * Version 1.0
 **/
public class _704二分查找 {//看力扣35题
    public int search(int[] nums, int target) {
        if(target < nums[0] || target > nums[nums.length-1]){
            return -1;
        }
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(target > nums[mid]){
                low = mid + 1;
            }else if(target < nums[mid]){
                high = mid - 1;
            }
        }
        return -1;
    }
}
