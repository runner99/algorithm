package com.runner.sort;

import java.util.Arrays;

//插入排序
public class InsertSort {
    public static void main(String[] args) {
        int arr[] = {3, 9, -1, 10, 20};

        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        insertsort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }
    public static void insertsort(int[] arr){
        int insertVal = 0;
        int insertIndex = 0;
        for (int i=1;i<arr.length;i++){
            insertIndex = i-1;
            insertVal = arr[i];
            while (insertIndex>=0&&insertVal<arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            if (insertIndex+1!=i){
                arr[insertIndex+1] = insertVal;
            }
        }
    }
}
