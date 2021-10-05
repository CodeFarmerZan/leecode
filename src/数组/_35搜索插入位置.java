package 数组;

/**
 * @ClassName _35搜索插入位置
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/5/30 19:12
 * Version 1.0
 **/
public class _35搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = (left + right)/2;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

}
