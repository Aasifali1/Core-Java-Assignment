package com.knoldus.kup.Core_Java.ques2;


public class SortArray {
    public static int[] sortBinary(int[] arr){
        for (int i=0;i<arr.length;i++){
            int temp = 0;
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int a:
             arr) {
            System.out.print(a+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        int b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        SortArray.sortBinary(b_nums); // Output: 0 0 0 0 0 1 1 1 1 1
    }
}
