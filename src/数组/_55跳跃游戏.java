package 数组;

/**
 * @ClassName _55跳跃游戏
 * Description TODO
 * @Author 昝亚杰
 * Date 2021/5/24 19:20
 * Version 1.0
 **/
public class _55跳跃游戏 {
    //动态规划（运行超时），答案用的贪心
    public boolean flag = false;
    public boolean canJump(int[] nums) {
        jump(nums,0);
        return flag;
    }
    public void jump(int[] nums,int thislocation){
        if(thislocation == nums.length - 1 || nums[thislocation] >= (nums.length-1-thislocation)){
            flag = true;
            return;
        }
        if(thislocation > nums.length - 1){
            return;
        }
        if(nums[thislocation] == 0){
            return;
        }
        if(flag == false){
            for(int i = 1; i <= nums[thislocation]; i++){
                jump(nums,thislocation + i);
            }
        }


    }

}

