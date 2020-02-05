package com.sparta.gwilymt;
import java.util.Arrays;

class AnagramChecker {
    static boolean isAnagram(String firstString, String secondString){
        char[] firstStringArray = firstString.toLowerCase().toCharArray();
        char[] secondStringArray = secondString.toLowerCase().toCharArray();
        BubbleSort.bubbleSort(firstStringArray);
        BubbleSort.bubbleSort(secondStringArray);
        return Arrays.equals(firstStringArray, secondStringArray);
    }
}