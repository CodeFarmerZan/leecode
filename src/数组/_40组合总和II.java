package 数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName _40组合总和II
 * Description TODO
 * @Author 昝亚杰
 * Date 2021/5/22 21:29
 * Version 1.0
 **/
public class _40组合总和II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        for(int i = 0; i < candidates.length; i++){
            if(i == 0||candidates[i] != candidates[i-1])
                fun(candidates,target,i,list,lists);
        }
        return lists;
    }
    public void fun(int[] candidates, int target, int index, List<Integer> list, List<List<Integer>> lists){
        if(target - candidates[index] == 0){
            list.add(candidates[index]);
            lists.add(new ArrayList<Integer>(list));
            list.remove(list.size()-1);
            return;
        }
        if(index == candidates.length||target-candidates[index] < 0){
            return;
        }
        if(target - candidates[index] > 0){
            list.add(candidates[index]);
            for(int i = index + 1; i < candidates.length; i++){
                fun(candidates,target-candidates[index],i,list,lists);
            }
            list.remove(list.size()-1);
        }

    }

}
