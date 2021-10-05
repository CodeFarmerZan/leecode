package 面试相关;

import java.util.Scanner;

/**
 * @ClassName 进制
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/26 20:37
 * Version 1.0
 **/
public class 进制 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        System.out.println(jinzhi(s[0],s[1],s[2]));
    }
    public static String jinzhi(String z,String a, String b) {
        StringBuilder res = new StringBuilder();
        int n = Integer.parseInt(z);
        int carry = 0;
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        while (l1 >= 0 || l2 >= 0) {
            int x = l1 < 0 ? 0 : a.charAt(l1) - '0';
            int y = l2 < 0 ? 0 : b.charAt(l2) - '0';

            int sum = x + y + carry;
            res.append(sum % n);
            carry = sum / n;

            l1--;
            l2--;
        }
        if (carry != 0) res.append(carry);
        return res.reverse().toString();
    }

}
