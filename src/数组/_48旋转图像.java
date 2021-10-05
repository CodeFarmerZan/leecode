package 数组;

import java.util.Scanner;

/**
 * @ClassName _48旋转图像
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/5/26 21:42
 * Version 1.0
 **/
public class _48旋转图像 {
    public static void main(String[] args) {
        int n,m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int matrix[][] = new int[n][n];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = in.nextInt();
            }
        }
        m = in.nextInt();
        int a = m % 4;
        while(a-- > 0){
            rotate(matrix);
        }
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix) {//此处为旋转图像的代码
        int n = matrix.length;
        int[][] new_matrix = new int[n][n];
        for(int i = 0;i < n; i++){
            for(int j = 0; j < n; j++){
                new_matrix[j][n-1-i] = matrix[i][j];
            }
        }
        for(int i = 0;i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = new_matrix[i][j];
            }
        }
    }
}
