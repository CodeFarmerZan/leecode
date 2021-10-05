package 面试相关;

import org.junit.Test;

import java.util.Scanner;

/**
 * @ClassName integer和int
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/26 11:32
 * Version 1.0
 **/
public class 背包问题 {
    public static int fun(int n,int W,int[] w, int[] v,int[] m) {
        int[] dp = new int[W+1];
        for(int i = 0; i < n; i++){
            for(int k =1; k <= m[i]; k++){
                for(int j = W; j >= w[i]; j--) {
                    if(j >= k*w[i]) {
                        dp[j] = Math.max(dp[j], dp[j - k*w[i]] + k*v[i]);
                    }
                }
            }
        }
        return dp[W];
    }
    public static int main(String[] args) {
        int N,n;
        Scanner scanner = new Scanner(System.in);
        N = Integer.parseInt(scanner.nextLine());
        n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int[] weight = new int[n];
        int[] value = new int[n];
        int[] m = new int[n];
        while (count < n){
            String string = scanner.nextLine();
            String[] strings = string.split(" ");
            weight[count] = Integer.parseInt(strings[0]);
            value[count] = Integer.parseInt(strings[1]);
            m[count] = 65535;
            count++;
        }
        return fun(n,N,weight,value,m);
    }
}
