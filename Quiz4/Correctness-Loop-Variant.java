import java.io.*;
import java.util.*;

public class Solution {

    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){ // traverses the array
            int value = A[i]; // grabs the index value
            int j = i - 1; // index before current
            while(j >= 0 && A[j] > value){ // while prev index is greater than zero and prev value is greater than index value
                A[j + 1] = A[j]; // re-write the current value with previous
                j = j - 1; // move prev to space in front of prev
            }
            A[j + 1] = value; // 
        }

        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
