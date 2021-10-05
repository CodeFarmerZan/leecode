package 数组;

/**
 * @ClassName _45跳跃游戏II
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/5/25 18:16
 * Version 1.0
 **/
public class _45跳跃游戏II {
    public int jump(int[] nums) {
        int len = nums.length - 1;
        int step = 0;
        while(len!=0){
            for(int i = 0; i < len; i++){
                if( i + nums[i] >= len){
                    len = i;
                    step++;
                    break;
                }
            }
        }
        return step;

    }
}
