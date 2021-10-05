package 哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName _454四数之和
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/13 11:12
 * Version 1.0
 **/
public class _454四数之和II {
/*    本题是使用哈希法的经典题目，而15.三数之和，18.四数之和并不合适使用哈希法，
    因为三数之和和四数之和这两道题目使用哈希法在不超时的情况下做到对结果去重是很困难的，
    很有多细节需要处理。*/
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i : nums1){
            for(int j : nums2){
                int temp = i + j;
                if(map.containsKey(temp)){
                    map.put(temp,map.get(temp) + 1);
                }else{
                    map.put(temp,1);
                }
            }
        }
        for(int i : nums3){
            for(int j : nums4){
                int temp = i + j;
                if(map.containsKey(-temp)){
                    count += map.get(-temp);
                }
            }
        }
        return count;
    }
}
