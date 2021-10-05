package 数组;

import org.junit.Test;

/**
 * @ClassName _75颜色分类
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/8 20:43
 * Version 1.0
 **/
public class _75颜色分类 {
    @Test
    public static void main(String[] args) {
        int[] a = new int[]{2,1};
        sortColors(a);
    }
    public static void sortColors(int[] nums) {
        int cur = 0,cur1 = nums.length-1;
        int i = 0,j = nums.length - 1;
        for(; i < nums.length; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[cur];
                nums[cur] = temp;
                cur++;
            }
        }
        for(; j >= 0; j--){
            if(nums[j] == 2){
                int temp = nums[j];
                nums[j] = nums[cur1];
                nums[cur1] = temp;
                cur1--;
            }
        }
    }
}
