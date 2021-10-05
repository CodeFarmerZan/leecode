package 字符串;

/**
 * @ClassName 剑指offer58II左旋转字符串
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/20 19:49
 * Version 1.0
 **/
public class 剑指offer58II左旋转字符串 {//局部旋转+整体旋转思想
    public void reverse(char[] chars,int i,int j){
        while(i < j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
    }
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();;
        reverse(chars,0,n-1);
        reverse(chars,n,chars.length-1);
        reverse(chars,0,chars.length-1);
        return new String(chars);
    }
}
