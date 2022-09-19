import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
Scanner sc=new Scanner(System.in);
int l1=sc.nextInt();
int l2 =sc.nextInt();
int[] arr1=new int[l1];
int[] arr2=new int[l2];
for (int i=0;i<arr1.length;i++)
{
    arr1[i]=sc.nextInt();
}
for (int i=0;i<arr2.length;i++)
{
    arr2[i]=sc.nextInt();
}
int i=arr1.length;
int j=arr2.length;
int k=0;
if(i>j)
{
    k=i;
}
else
{
    k=j;
}
int[] sum=new int[k];
for(int length=k; length>0;k--)
    
    {
     sum[length] =arr1[length]+arr2[length]  ;
     System.out.println(sum[length]);
    }
 }

}