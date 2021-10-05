package 字符串;

import org.junit.Test;

/**
 * @ClassName 剑指offer05替换空格
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/17 20:27
 * Version 1.0
 **/
public class 剑指offer05替换空格 {
    @Test
    public void fun() {
        replaceSpace("we are heppy.");
    }
//    public String replaceSpace(String s) {击败23%
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0; i < s.length(); i++){
//            if(" ".equals(String.valueOf(s.charAt(i)))){
//                sb.append("%20");
//            }else{
//                sb.append(s.charAt(i));
//            }
//        }
//        return new String(sb);
//    }
    public String replaceSpace(String s) {//击败100%
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < chars.length; i++){
            if(" ".equals(String.valueOf(chars[i]))){
                sb.append("%20");
            }else{
                sb.append(chars[i]);
            }
        }
        return new String(sb);
    }
}
