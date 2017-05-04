package cn.offer;

/**
 * Description: 找出字符串中第一个出现一次的字符 <br>
 * 
 * @author li.an1 <br>
 * @version 8.0 <br>
 * @taskId <br>
 * @CreateDate 2017-5-4 <br>
 * @since V8 <br>
 * @see cn.offer <br>
 */

public class FirstOnceChar_35 {

    public static void main(String[] args) {
        String str = "abccddeffab";
        
        // 第一次扫描记录每个字符出现次数
        int[] table = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            table[c]++;
        }

        // 第二次扫描定位第一个只出现1次的字符
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (1 == table[c]) {
                System.out.println(c);
                return;
            }
        }
    }
}
