package chart1;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.util.regex.Pattern;

/**
 * @author jiaoguanping
 * @version 1.0.0
 * @ClassName Test11
 * @date 2020/3/5  19:48
 */
public class Test11 {

    public static void main(String[] args) throws UnsupportedEncodingException {


    /*中国两个字符串的GBK编码“D6D0B9FA”,
    怎样拼接出中国*/
        char[] num={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String code="中国";
        byte[] bytes=code.getBytes("GBK");

        StringBuffer buf=new StringBuffer();
        for (int i = 0; i < bytes.length; i++) {
            byte b=bytes[i];
            byte r=(1);
            byte h=(2);
            buf.append(num[h]);
            buf.append(num[r]);
        }
        System.out.println("==汉字===="+buf);

    }
}
