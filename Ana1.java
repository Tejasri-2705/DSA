import java.io.*;
import java.util.*;
class Ana1
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    System.out.println(array(s1,s2));
}
/*public static boolean array(String s1,String s2)
{
    s1.toLowerCase();
    s2.toLowerCase();
    char ch1[]=s1.toCharArray();
    char ch2[]=s2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    String s12=String.valueOf(ch1);
    String s22=String.valueOf(ch2);
    if(s12.equals(s22))
    {
        return true;
    } 
    return false;    
}
public static boolean array(String s1,String s2)
{
    if(s1.length()!=s2.length())
    {
        return false;
    }
    char ch1[]=s1.toCharArray();
    char ch2[]=s2.toCharArray();
    HashMap<Character,Integer> hm1=new HashMap<>();
    HashMap<Character,Integer> hm2=new HashMap<>();
    for(int i=0;i<s1.length();i++)
    {
        hm1.put(ch1[i],hm1.getOrDefault(ch1[i],0)+1);
         hm2.put(ch2[i],hm2.getOrDefault(ch2[i],0)+1);
    }
    for(Map.Entry<Character,Integer> e:hm1.entrySet())
    {
        Character key = e.getKey();
        if(! hm2.containsKey(key))
        {
            return false;
        }
        int v1 = e.getValue();
        int v2 = hm2.get(key);
        if(!(v1==v2))
        {
            return false;
        }
    }
    return true;
}*/
public static boolean array(String s1,String s2)
{
    if(s1.length()!=s2.length())
    {
        return false;
    }
    HashMap<Character,Integer> hm1=new HashMap<>();
    for(int i=0;i<s1.length();i++)
    {
        hm1.put(s1.charAt(i),hm1.getOrDefault(s1.charAt(i),0)+1);
         hm1.put(s2.charAt(i),hm1.getOrDefault(s2.charAt(i),0)-1);
    }
    for(Map.Entry<Character,Integer> e:hm1.entrySet())
    {
        int v1 = e.getValue();
        if(v1!=0)
        {
            return false;
        }
    }
    return true;
}

}