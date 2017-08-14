import java.io.*;
import java.util.*;
import java.text.NumberFormat;

public class Solution {

    public static void main(String[] args)throws IOException 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s=br.readLine();
int j=s.length();
String sub2=s.substring(j-2,j);
String sub1=s.substring(0,j-2);
StringTokenizer st=new StringTokenizer(sub1,":");
int hh12=Integer.parseInt(st.nextToken());
String mm12=st.nextToken();
int mm=Integer.parseInt(mm12);
String ss12=st.nextToken();
int ss=Integer.parseInt(ss12);

String word1="AM";

int hh24;
if((hh12>=0&&hh12<=12)&&(mm>=0&&mm<=59)&&(ss>=0&&ss<=59))
{
if (sub2.equalsIgnoreCase(word1))
{
  if(hh12==12)
   {hh24=hh12+12;}
  else{hh24=hh12;}

}
else 
{
  if(hh12==12)
  {hh24=hh12;}
  else{hh24=hh12+12;}

}
if(hh24==24)
{hh24=00;}
NumberFormat nf=NumberFormat.getNumberInstance();
    nf.setMinimumIntegerDigits(2);
    String H=nf.format(hh24);
    System.out.println(H+":"+mm12+":"+ss12);
}

else
{System.out.println("Wrong time input");}

    }
}
