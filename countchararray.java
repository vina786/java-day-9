import java.util.*;
public class countchararray {
    public static void main(String args[])
    {
        //only for capital 
        String a="AMARON";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-65]++;
        }
        System.out.println(Arrays.toString(c));
    //only for small
    String a1="devara";
    int c1[]=new int[26];
    for(int i=0;i<a1.length();i++)
    {
        c1[((int)(a1.charAt(i)))-97]++;
    }
    System.out.println(Arrays.toString(c1));
}
}