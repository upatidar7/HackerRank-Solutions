import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i=0 ,n =0 ;
        Scanner sc = new Scanner(System.in);
         i = sc.nextInt();
         n= sc.nextInt();
        
        int[] arr =  new int[i];
        for(int k=0;k<i;k++)
            {
            arr[k] = sc.nextInt();
            
        }
        for(int l = 0;  l <n ; l ++ ) 
            {
        int temp = arr[0];
           for(int m = 0;  m <i -1; m ++ ) 
               {
                arr[m] = arr[m+1];
           }
            arr[i-1] = temp;
        }
        
      for(int k=0;k<i;k++)
            {
           System.out.print(arr[k]+" ");
           
        }  
        
    }
}