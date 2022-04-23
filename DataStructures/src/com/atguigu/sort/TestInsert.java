package com.atguigu.sort;

import java.util.Arrays;

public class TestInsert {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertSort(int[] arr){

        for (int i=1;i<arr.length;i++){
            int index =i-1;
            int value = arr[i];
            while (index>=0 && arr[index]>value ){
                arr[index+1] = arr[index];
                index--;
            }
//            if (index!=i-1){
                arr[index+1]=value;


        }
    }
}
