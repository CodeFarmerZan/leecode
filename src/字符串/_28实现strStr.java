package 字符串;

/**
 * @ClassName _28实现strStr
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/6/28 19:19
 * Version 1.0
 **/
public class _28实现strStr {//KMP
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }

        int[] next = new int[needle.length()];
        getNext(next, needle);
        int j = -1;
        for(int i = 0; i<haystack.length();i++){
            while(j>=0 && haystack.charAt(i) != needle.charAt(j+1)){
                j = next[j];
            }
            if(haystack.charAt(i)==needle.charAt(j+1)){
                j++;
            }
            if(j==needle.length()-1){
                return (i-needle.length()+1);
            }
        }

        return -1;
    }
    public void getNext(int[] next,String needle){
        int j = -1;
        next[0] = j;
        int len = needle.length();
        for(int i = 1; i < len; i++){
            while (j >= 0 && needle.charAt(i) != needle.charAt(j + 1)){
                j = next[j];
            }
            if(needle.charAt(i) == needle.charAt(j + 1)){
                j++;
            }
            next[i] = j;
        }
    }
}
