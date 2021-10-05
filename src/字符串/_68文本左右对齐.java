package 字符串;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName _68文本左右对齐
 * @Description TODO
 * @Author 昝亚杰
 * @Date 2021/8/21 21:33
 * Version 1.0
 **/
public class _68文本左右对齐 {
    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> list = fullJustify(words, 16);
        for(String string : list){
            System.out.println(string);
        }
    }
    public static List<String> fullJustify(String[] words, int maxWidth) {//未解决
        int size = words.length;
        int len = 0;//单词相加总长度
        int word_len = 0;//单词个数
        int i = 0,j = 0,space_len = 0;
        List<String> res = new ArrayList<String>();
        len = words[0].length();
        while(i < size - 1){
            i++;
            len += words[i].length();
            word_len++;
            if(len > maxWidth){
                len -= words[i].length();
                word_len--;//记得每一行算完置零
                i--;
                space_len = (16 - len) / ((word_len - 1) == 0 ? 1 : (word_len - 1));
                StringBuffer string = new StringBuffer();
                for(j = i - (word_len - 1); j < i-1; j++){
                    string.append(words[j]);
                    for(int z = 0; z < space_len; z++){
                        string.append("*");
                    }
                }
                string.append(words[j+1]);
                for(int y = 0; y < 16 - len - space_len * (word_len - 2); y++){
                    string.append("*");
                }
                res.add(string.toString());
                len = 0;
                word_len = 0;


            }
        }
        return res;
    }
}
