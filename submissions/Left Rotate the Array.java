import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        String input[]=br.readLine().split(" ");
        int len=Integer.parseInt(input[0]);
        int rot=Integer.parseInt(input[1]);
        
        String arr[]=br.readLine().split(" ");
        
        int ans[]=new int[len];
        for(int i=0;i<len;i++){


                ans[(k+len)%len]= Integer.parseInt(arr[i]);
            }
            else
                ans[k]= Integer.parseInt(arr[i]);
                
        }
        
