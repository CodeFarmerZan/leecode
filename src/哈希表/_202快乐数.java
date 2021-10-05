package 哈希表;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName _202快乐数
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/12 10:30
 * Version 1.0
 **/
public class _202快乐数 {
    public static void main(String[] args) {
        isHappy(19);
    }
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        while(true){
            int sum = numSum(n);
            if(sum == 1){
                return true;
            }else if(set.contains(sum)){
                return false;
            }else{
                set.add(sum);
            }
            n = sum;
        }
    }
    public static int numSum(int num){
        int sum = 0;
        while(num!=0){
            int gewei = num%10;
            sum += gewei*gewei;
            num = num / 10;

        }
        return sum;
    }
}
