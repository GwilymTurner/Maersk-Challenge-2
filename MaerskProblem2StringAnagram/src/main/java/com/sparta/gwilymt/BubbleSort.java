package com.sparta.gwilymt;

class BubbleSort {
    static char[] bubbleSort(char[] array){
        char swapSpare;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] > array[i+1]){
                swapSpare = array[i];
                array[i] = array[i+1];
                array[i+1] = swapSpare;
                bubbleSort(array);
            }
        }
        return array;
    }
}