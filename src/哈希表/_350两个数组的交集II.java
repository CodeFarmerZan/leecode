package 哈希表;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName _350两个数组的交集II
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/11 19:37
 * Version 1.0
 **/
public class _350两个数组的交集II {
    public int[] intersect(int[] nums1, int[] nums2) {//哈希表法
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result = new int[nums1.length + nums2.length];
        for(int num : nums1){
            int count = map.getOrDefault(num,0) + 1;
            map.put(num,count);
        }
        int index = 0;
        for(int num : nums2){
            int count = map.getOrDefault(num,0);
            if(count > 0){
                result[index++] = num;
                count--;
                if(count > 0){
                    map.put(num,count);
                }else if(count <= 0){
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(result,0,index);
    }
//    public int[] intersect(int[] nums1, int[] nums2) {//排序+指针
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int[] result = new int[nums1.length + nums2.length];
//        int index = 0,index1 = 0,index2 = 0;
//        while(index1 < nums1.length && index2 < nums2.length){
//            if(nums1[index1] < nums2[index2]){
//                index1++;
//            }else if(nums1[index1] > nums2[index2]){
//                index2++;
//            }else if(nums1[index1] == nums2[index2]){
//                result[index++] = nums1[index1];
//                index1++;
//                index2++;
//            }
//        }
//        return Arrays.copyOfRange(result,0,index);
//    }
}
