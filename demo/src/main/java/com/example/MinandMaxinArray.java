package com.example;
class Pair<U, V> {
    public final U first;
    public final V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

public class MinandMaxinArray {
    public Pair<Long, Long> getMinMax(int[] arr) {
    long min=arr[0];
    long max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
        if(arr[i]>max){
            max=arr[i];
        }
    
    }
    return new Pair(min,max);
    
}
}
