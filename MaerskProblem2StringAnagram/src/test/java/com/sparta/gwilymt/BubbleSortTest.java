package com.sparta.gwilymt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BubbleSortTest {
    char[] charArray = {'s', 'r', 'g', 'b', 'l'};
    char[] sortedCharArray = {'b', 'g', 'l','r', 's'};
    @Test
    void testThatBubbleSortSortsCharactersCorrectly(){
        Assertions.assertArrayEquals(sortedCharArray, BubbleSort.bubbleSort(charArray));
    }
}