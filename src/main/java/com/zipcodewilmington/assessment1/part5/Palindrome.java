package com.zipcodewilmington.assessment1.part5;

import javax.sound.midi.Soundbank;

public class Palindrome {

    public Integer count = 0;

    public Integer countPalindromes(String input){
        for (int i = 0; i < input.length()-1; i++) {
            if(input.charAt(i) == input.charAt(i+1)){
                palindrome(input, i, i+1);
            }
            if(i != 0){
                palindrome(input, i-1, i+1);
            }
            count++;
        }
        count++;
        return count;
    }

    public void palindrome(String input, Integer leftIndex, Integer rightIndex){
        if(rightIndex < input.length() && leftIndex >= 0) {
            if (input.charAt(leftIndex) == input.charAt(rightIndex)) {
                count++;
                palindrome(input, leftIndex - 1, rightIndex + 1);
            }
        }
    }

//    public static void main(String[] args){
//        Palindrome palindrome = new Palindrome();
//        Integer expected = palindrome.countPalindromes("aaa");
//        Integer actual = 6;
//        System.out.println(expected);
//        palindrome.count = 0;
//        expected = palindrome.countPalindromes("abccba");
//        Integer actual2 = 9;
//        System.out.println(expected);
//        palindrome.count = 0;
//        expected = palindrome.countPalindromes("daata");
//        Integer actual3 = 7;
//        System.out.println(expected);
//    }
}
