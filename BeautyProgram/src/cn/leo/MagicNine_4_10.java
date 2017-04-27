package cn.leo;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 题目：神奇的9位数 <br>
 * 1，该数包含1-9九个数字 2，abcdefghi其中a能被1整除，ab能被2整除，abce能被3整除，依次类推abcdefghi能被9整除
 * 
 * @author li.an1 <br>
 * @version 8.0 <br>
 * @taskId <br>
 * @CreateDate 2017-4-28 <br>
 * @since V8 <br>
 * @see cn.leo <br>
 */
public class MagicNine_4_10 {

    public static void main(String[] args) {
        method1();
    }

    /**
     * Description: 枚举法 <br>
     * 
     * @author li.an1 <br>
     * @taskId <br>
     * <br>
     */
    private static void method1() {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i1 = 1; i1 <= 9; i1++) {
            arrayList.add(i1);
            for (int i2 = 2; i2 <= 8; i2 = i2 + 2) {
                if (!arrayList.contains(i2)) {
                    arrayList.add(i2);
                    for (int i3 = 1; i3 <= 9; i3++) {
                        if ((i1 * 100 + i2 * 10 + i3) % 3 == 0 && !arrayList.contains(i3)) {
                            arrayList.add(i3);
                            for (int i4 = 2; i4 <= 8; i4 = i4 + 2) {
                                if ((i1 * 1000 + i2 * 100 + i3 * 10 + i4) % 4 == 0 && !arrayList.contains(i4)) {
                                    arrayList.add(i4);
                                    if (!arrayList.contains(5)) {
                                        int i5 = 5;
                                        arrayList.add(i5);
                                        for (int i6 = 2; i6 <= 8; i6 = i6 + 2) {
                                            if ((i1 * 100000 + i2 * 10000 + i3 * 1000 + i4 * 100 + i5 * 10 + i6) % 6 == 0
                                                && !arrayList.contains(i6)) {
                                                arrayList.add(i6);
                                                for (int i7 = 1; i7 <= 9; i7++) {
                                                    if ((i1 * 1000000 + i2 * 100000 + i3 * 10000 + i4 * 1000 + i5 * 100
                                                        + i6 * 10 + i7) % 7 == 0
                                                        && !arrayList.contains(i7)) {
                                                        arrayList.add(i7);
                                                        for (int i8 = 2; i8 <= 8; i8 = i8 + 2) {
                                                            if ((i1 * 10000000 + i2 * 1000000 + i3 * 100000 + i4
                                                                * 10000 + i5 * 1000 + i6 * 100 + i7 * 10 + i8) % 8 == 0
                                                                && !arrayList.contains(i8)) {
                                                                arrayList.add(i8);
                                                                for (int i9 = 1; i9 <= 9; i9++) {
                                                                    if ((i1 * 100000000 + i2 * 10000000 + i3 * 1000000
                                                                        + i4 * 100000 + i5 * 10000 + i6 * 1000 + i7
                                                                        * 100 + i8 * 10 + i9) % 9 == 0
                                                                        && !arrayList.contains(i9)) {
                                                                        StringBuffer sb = new StringBuffer();
                                                                        sb.append(i1).append(i2).append(i3).append(i4)
                                                                            .append(i5).append(i6).append(i7)
                                                                            .append(i8).append(i9);
                                                                        System.out.println(sb.toString());
                                                                    }
                                                                }
                                                                arrayList.remove(7);
                                                            }
                                                        }
                                                        arrayList.remove(6);
                                                    }
                                                }
                                                arrayList.remove(5);
                                            }
                                        }
                                        arrayList.remove(4);
                                    }
                                    arrayList.remove(3);
                                }
                            }
                            arrayList.remove(2);
                        }
                    }
                    arrayList.remove(1);

                }
            }
            arrayList.remove(0);
        }
    }
    
    
    /**
     * Description: 分析法 <br> 
     * array[5] 
     * @author li.an1 <br>
     * @taskId <br> <br>
     */
    private static void method2() {
        
    }

}
