package chart1;

public class Square {
    long width;  
    public Square(long l) {   
        width = l;  
    }  
    public static void main(String arg[]) {   
        Square a, b, c;  
        a = new Square(42L);   
        b = new Square(42L);   
        c = b;   
        long s = 42L;
        System.out.println(b == c);
        Integer i03 =Integer.valueOf(59);
        Integer i04 = new Integer(59);
        System.out.println(i03 == i04);
    } 
}