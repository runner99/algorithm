package com.runner.sort;

import java.util.Arrays;

//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
		int arr[] = {3, 9, -1, 10, 20};

		System.out.println("排序前");
		System.out.println(Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr){
        boolean flag = false;//这个用于优化，放在循环外面节省空间，放在里面的话每次都要开辟空间
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (!flag){
                break;
            }else {
                flag = false;//后面一轮开始前重置一下
            }
        }
    }
}
