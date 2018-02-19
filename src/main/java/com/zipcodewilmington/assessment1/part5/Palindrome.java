package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int numberofPalindromes = 0;
        // start at the ends and converge in middle, checking for palindromes along the way
        // If the char at index i == index j char, check for palindrome
        for (int i = 0; i < input.length(); i++) {
            for (int j = input.length() - 1; j >= i; j--) {
                if (input.charAt(i) == input.charAt(j)) {
                    if (isPalindrome(input, i, j)) {
                        numberofPalindromes++;
                    }
                }
            }
        }
        return numberofPalindromes;
    }


    public static boolean isPalindrome(String input, int start, int end) {
        if (start == end) {
            return true;
        }
        for (int i = 0; i <= (end - start) / 2; i++) {
            if (input.charAt(i + start) != input.charAt(end - i))
                return false;
        }


        return true;
    }
}
