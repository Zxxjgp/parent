package test.com.chart1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jgp
 * @version 1.0.0
 * @ClassName ArrayDemo
 * @date 2020/2/27  10:23
 */
public class ListFile {
/*    public static void main(String[] args) {
        ListFile listfile = new ListFile();
        listfile.listJavaFile("C:\\workspace\\test1");
    }*/

    public void listJavaFile(String fileName) {
        //文件数量
        int fileCount = 0;
        int fileFolder = 0;
        File file = new File(fileName);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                String name = files[i].getName();
                if (name.trim().toLowerCase().endsWith(".")) {
                    fileCount = fileCount + 1;
                    System.out.println(name + "\t");
                }
                if (files[i].isDirectory()) {
                    fileFolder = fileFolder + 1;
                    String path = files[i].getPath();
                    //迭代循环
                    listJavaFile(path);
                }
            }
        }
        System.out.println("文件数量：{}" + fileCount);
        System.out.println("文件夹数量：{}" + fileFolder);
    }


    /**
     * 下划线转驼峰
     *
     * @param str
     * @return
     */
    public static String camelToUnderline(String str) {
        //判断空
        if (str == null || str.trim().isEmpty()) {
            return "";
        }
        int len = str.length();
        StringBuilder sb = new StringBuilder(len);
        sb.append(str.substring(0, 1).toLowerCase());
        for (int i = 1; i < len; i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append("_");
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String StringTransformation(String str) {
        String result = str;
        if (str.contains("_")) {
            StringBuffer sb = new StringBuffer();
            Pattern pattern = Pattern.compile("([A-Za-z\\d]+)(_)?");
            Matcher matcher = pattern.matcher(str);
            boolean smallCamel = true;
            while (matcher.find()) {
                String word = matcher.group();
                sb.append(smallCamel && matcher.start() == 0 ? Character.toLowerCase(word.charAt(0))
                        : Character.toUpperCase(word.charAt(0)));
                int index = word.lastIndexOf('_');
                if (index > 0) {
                    sb.append(word.substring(1, index).toLowerCase());
                } else {
                    sb.append(word.substring(1).toLowerCase());
                }
            }
            result = sb.toString();
        } else {
            result = str.toLowerCase();
        }
        return result;
    }

    //一个数的因子
    //输入一个数，输出这个数的所有因子，并返回因子的个数


    public static void main(String[] args) throws Exception {
    }
    public static List<Integer> getFactors(int n) throws Exception {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        if (n == 0) {
            throw new Exception("空数字") ;
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    array.add(i);
                }
            }

        }
        return array;
    }
}