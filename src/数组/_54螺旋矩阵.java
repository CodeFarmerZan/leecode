package 数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName _54螺旋矩阵
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/3 20:44
 * Version 1.0
 **/
public class _54螺旋矩阵 {//59螺旋矩阵II
    public static List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        List<Integer> result = new ArrayList<Integer>();
        while(result.size() < (matrix.length) * (matrix[0].length)){
            int flag = 0;
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            for(int j = top + 1; j <= bottom; j++){
                result.add(matrix[j][right]);
            }
            if(top != bottom && right != left){//！！！！！
                for(int i = right - 1; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                for(int j = bottom - 1; j > top; j--){
                    result.add(matrix[j][left]);
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> result = new ArrayList<Integer>();
        result=spiralOrder(a);
        for(int i : result){
            System.out.println(i);
        }
    }
}
