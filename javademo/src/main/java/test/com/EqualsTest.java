package test.com;

public class EqualsTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        String s3 = "abc";
        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println("1: " + (s1 == s2));
        System.out.println("2: " + (s1 == s3));
        System.out.println("3: " + s1.equals(s2));
        System.out.println("4: " + s4 == s5);
        System.out.println("5: " + s4.equals(s5));
    }
}