//Task 
//Given an array,A , of N integers, print A's elements in reverse order as a single line of space-separated numbers.
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        for(int j=n-1; j>-1; j--){
            System.out.print(arr[j]+" ");
        }
    }
}
// ALTERNATIVE 
public class Solution {

    public static void print(String[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] arr = in.nextLine().split(" ");
        in.close();
        print(arr);
    }
}
