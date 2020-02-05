package com.sparta.gwilymt;

public class App 
{
    public static void main( String[] args )
    {
        if(AnagramChecker.isAnagram("HeLLo", "OllEh")){
            System.out.println("It is an anagram!");
        }else{
            System.out.println("It is not an anagram");
        }
    }
}