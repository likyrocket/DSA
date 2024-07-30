package com.example;

public class Bitonic {
    int findMaximum(int[] arr, int size) {
        int left=0,right=size-1,mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if((mid==0 || arr[mid]>arr[mid-1]) && (mid==size-1 || arr[mid]>arr[mid-1])){
                return arr[mid];
                }
            else if(mid<size-1 && arr[mid]<arr[mid+1]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }       
    }
        return -1; 
   }
}