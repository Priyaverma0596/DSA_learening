import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
public static void reverse(int[]arr,int i,int j)
{  //Revers function to reverse first and second part of an array
    int left=i;
    int right=j;
    while(left<right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
}
  public static void rotate(int[] arr, int rot){
    // write your code here
    rot=rot%arr.length; //if rotation valure is more then if we do this because rotation are repeating after some time
    if(rot<0)  //when k value is less than 0 
    {
        rot=rot+arr.length;
    }
    //part1 reverse
     reverse(arr,0,arr.length-rot-1);
    //part2 reverse
     reverse(arr,arr.length-rot, arr.length-1);
    //part3 reverse (all reverse0)
    reverse(arr,0,arr.length-1);
    
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}