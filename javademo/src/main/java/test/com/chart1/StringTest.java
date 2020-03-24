package test.com.chart1;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName StringTest
 * @date 2020/3/3  23:06
 */
public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "我是中国人";
        String result = new String(str.getBytes("ISO-8859-1"), "GBK");
        System.out.println(result);
        int[] g = null;
        if (null == g){
            System.out.println("qqqqqqqqq");
        }
    }
}
