package com.runner.sort;

import java.util.Arrays;

//选择排序
public class SelectSort {
    public static void main(String[] args) {
        int arr[] = {3, 9, -1, 10, 20};

        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        selectsort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }
    public static void selectsort(int[] arr){

        for (int i=0;i<arr.length-1;i++){
            int min = arr[i];
            int minindex = i;
            for (int j=i+1;j<arr.length;j++){
                if (min>arr[j]){
                    min = arr[j];
                    minindex = j;
                }
            }
            if (minindex!=i){
                int temp = arr[i];
                arr[i] = min;
                arr[minindex] = temp;
            }
        }
    }
}
