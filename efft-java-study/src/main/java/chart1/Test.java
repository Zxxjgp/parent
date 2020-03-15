package chart1;

public class Test
{
    public static int aMethod(int i)throws Exception
    {
        try{
            return i / 10;
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a Method");
        } finally{
            System.out.printf("finally");
        }
    }
 
    public static void main(String [] args)
    {
        String str = "word ";
        testInt(str);
        System.out.println(str);
    }

    public static void testInt(String j) {
        j += "ssssssssssssss";
        System.out.println("1111111111" + j);
    }

}