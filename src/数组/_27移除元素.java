package 数组;

/**
 * @ClassName _27移除元素
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/5/31 11:22
 * Version 1.0
 **/
public class _27移除元素 {
    public static int removeElement(int[] nums, int val) {//暴力
        int len = nums.length;
        for(int i = 0; i < len; i++){
            len--;
            if(val == nums[i]){
                for(int j = i; j < nums.length-1; j++){
                    nums[j] = nums[j+1];
                }
            }
        }
        return len;
    }

    public static int remove_Element(int[] nums, int val) {//双指针
        int low = 0;
        int high = 0;
        for(low = 0; high < nums.length; high++){
            if(nums[high] != val){
                nums[low] = nums[high];
                low++;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        int target = 2;
        removeElement(a,target);
    }
}
