package chart1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName Test01
 * @date 2020/1/10  9:08
 */
public class Test01 {
    public static void main(String[] args) {
        int[] ag = {0,7,1,1,1,2,2,3,3,4};
        paixu(ag);
        for (int o = 0; o < ag.length ; o++) {
            System.out.println(ag[o]);
        }
        TestInterface k = new TestInterface() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
/*        System.out.println(removeArray(ag));
        List<String> l = new ArrayList<>();*/
    }

    public static int removeArray(int[] args) {
        if (args.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j =1 ; j < args.length ; j++) {
            if (args[i] != args[j]) {
                i++;
                args[i] = args[j];
            }
        }
        return i + 1;
    }

    public static int[] paixu(int[] args) {
        for (int i =0 ; i < args.length ; i++) {
            for (int j = i+1; j < args.length; j++) {
                if (args[i] >= args[j]) {
                    int temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        return args;
    }
}
