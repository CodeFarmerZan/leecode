package 面试相关;

import com.sun.java.accessibility.util.TopLevelWindowListener;

import java.util.*;

/**
 * @ClassName 前k高元素
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/9/1 15:26
 * Version 1.0
 **/
public class 前k高元素 {
        public static int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
            for (int num : nums) {
                occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
            }

            // int[] 的第一个元素代表数组的值，第二个元素代表了该值出现的次数
            PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
                public int compare(int[] m, int[] n) {
                    return m[1] - n[1];
                }
            });
            for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
                int num = entry.getKey(), count = entry.getValue();
                if (queue.size() == k) {
                    if (queue.peek()[1] < count) {
                        queue.poll();
                        queue.offer(new int[]{num, count});
                    }
                } else {
                    queue.offer(new int[]{num, count});
                }
            }
            int[] ret = new int[k];
            for (int i = 0; i < k; ++i) {
                ret[i] = queue.poll()[0];
            }
            return ret;
        }
}
