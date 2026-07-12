import java.io.*;
import java.util.*;
class Ana2
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    System.out.println(array(s1,s2));
}
public static boolean array(String s1,String s2)
{
    int a[]=new int[26];
    s1.toLowerCase();
    s2.toLowerCase();
    if(s1.length()!=s2.length())
    {
        return false;
    }
    for(int i=0;i<s1.length();i++)
    {
        char ch1=s1.charAt(i);
        char ch2=s2.charAt(i);
        a[ch1-'a']++;
        a[ch2-'a']--;
    }
    for (int i = 0; i < 26; i++) {
        if (a[i] != 0) {
            return false;
        }
    }
    return true;






}

}