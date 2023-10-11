package com.jsp.pangram;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public static boolean isPangram(String input) {
        // Convert the input string to lowercase to handle case-insensitivity
        input = input.toLowerCase();
        
        // Create a set to store the unique lowercase letters in the input
        Set<Character> letterSet = new HashSet<>();
        
        // Iterate through each character in the input
        for (char c : input.toCharArray()) {
            // Check if the character is a lowercase letter (a to z)
            if (c >= 'a' && c <= 'z') {
                letterSet.add(c);
            }
        }
        
        // Check if the set size is 26 (all lowercase letters present)
        return letterSet.size() == 26;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input
        boolean isPangramResult = isPangram(input);
        
        if (isPangramResult) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
