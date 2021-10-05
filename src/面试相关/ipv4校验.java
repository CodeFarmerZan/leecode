package 面试相关;

import java.util.Scanner;

/**
 * @ClassName ipv4校验
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/26 20:32
 * Version 1.0
 **/
public class ipv4校验 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ipv4 = scanner.nextLine();
        System.out.println(Isipv4(ipv4));
    }
    public static boolean Isipv4(String ipv4){
        if(ipv4==null || ipv4.length()==0){
            return false;
        }
        String[] parts=ipv4.split("\\.");
        if(parts.length!=4){
            return false;
        }
        for(int i=0;i<parts.length;i++){
            try{
                int n=Integer.parseInt(parts[i]);
                if(n<0 || n>255){
                    return false;
                }
            }catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
