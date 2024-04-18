import java.util.Random;

public class genearatepassword
{
    
    static char[] generatepass(int len)
    {
        System.out.println("your passwoed is:");
        String charcaps="JRFJNEVJFIVNGOIVNVOIJROIJVVNV";
        String charsmall="jifroiwfjbnoijbmbnjgiojbmogjr";
        String num="123456789";
        String special="!@$%&*()><?";
        String result=charcaps+charsmall+num+special;
        Random rand=new Random();
        char[]password=new char[len];
        for(int i=0;i<len;i++)
        {
          password[i]=result.charAt(rand.nextInt(result.length()));
        }
         return password;
    }
    public static void main(String[] args) {
        int length=8;
        System.out.println(generatepass(length));
    }
}