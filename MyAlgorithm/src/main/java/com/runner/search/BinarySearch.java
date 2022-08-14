package com.runner.search;

//二分查找
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 10, 89,1000,1111, 1234 };
        System.out.println(BinarySearch(arr,1000));
    }

    public static int BinarySearch(int arr[],int findVal) {
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while (left<right){
            mid = (left+right)/2;
            if (arr[mid]<findVal){
                left = mid+1;
            }else if (arr[mid]>findVal){
                right = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
