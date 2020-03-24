package test.com.chart1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jgp
 * @version 1.0.0
 * @ClassName ArrayDemo
 * @date 2020/2/27  10:01
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] ints = setArray(500);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }


    /**
     * 500的数组，随机放入值为1-50中间的任意整数
     */
    public static int[] setArray(int n) {
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int result =buildRandom(1, 50);
            if (result % 2 == 0) {
                arrList.add(result);
            }
        }
        return arrList.stream().sorted().mapToInt(Integer::valueOf).distinct().toArray();
    }
    //产生1-50的随机数
    public static int buildRandom(int var1, int var2) {
        return (int)(Math.random()*var2+var1);
    }
}
