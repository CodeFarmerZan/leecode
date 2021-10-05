package 哈希表;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName _349两个数组的交集
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/11 19:07
 * Version 1.0
 **/
public class _349两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {//排序+指针
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[nums1.length + nums2.length];
        int index = 0,index1 = 0,index2 = 0;
        while(index1 < nums1.length && index2 < nums2.length){
            if(nums1[index1] < nums2[index2]){
                index1++;
            }else if(nums1[index1] > nums2[index2]){
                index2++;
            }else if(nums1[index1] == nums2[index2]){
                if(index == 0 || nums1[index1] != result[index - 1]){
                    result[index++] = nums1[index1];
                }
                index1++;
                index2++;
            }
        }
        return Arrays.copyOfRange(result,0,index);
    }
//    public int[] intersection(int[] nums1, int[] nums2) {//用set
//        Set<Integer> set1 = new HashSet<Integer>();
//        Set<Integer> res = new HashSet<Integer>();
//        for(int num : nums1){
//            set1.add(num);
//        }
//        for(int num : nums2){
//            if(set1.contains(num)){
//                res.add(num);
//            }
//        }
//        int[] results = new int[res.size()];
//        int index = 0;
//        for(int num : res){
//            results[index++] = num;
//        }
//        return results;
//    }
}
