package 数组;

/**
 * @ClassName _54螺旋矩阵II
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/3 21:07
 * Version 1.0
 **/
public class _59螺旋矩阵II {//54螺旋矩阵
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 0;
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while(num < n*n){
            for(int i = left; i <= right; i++){
                num++;
                matrix[top][i] = num;
            }
            for(int j = top + 1; j <= bottom; j++){
                num++;
                matrix[j][right] = num;
            }
            if(top != bottom && right != left){//！！！！！
                for(int i = right - 1; i >= left; i--){
                    num++;
                    matrix[bottom][i] = num;
                }
                for(int j = bottom - 1; j > top; j--){
                    num++;
                    matrix[j][left] = num;
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return matrix;
    }
}
