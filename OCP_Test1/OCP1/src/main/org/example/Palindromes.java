package org.example;

import java.util.Arrays;

public class Palindromes {
  /**
   * Method 2: Check if a phrase is a palindrome (ignore case and spaces)
   *
   * REQUIREMENTS:
   * 1. Ignore case differences
   * 2. Ignore spaces
   * 3. Only compare letters
   *
   * @param phrase The phrase to check
   * @return true if the phrase is a palindrome, false otherwise
   *
   * EXAMPLES:
   * Input: "A man a plan a canal Panama"
   * Output: true
   *
   * Input: "race car"
   * Output: true
   *
   * Input: "hello world"
   * Output: false
   *
   * Input: "Was it a car or a cat I saw"
   * Output: true
   *
   */
  public boolean isPalindromeIgnoreSpaces(String phrase) {

    StringBuilder sb = new StringBuilder();
    phrase = phrase.toLowerCase();
    String[] words = phrase.split(" +");

    for(String string: words) {
        sb.append(string);
    }

    phrase = sb.toString();
    String reversedString = sb.reverse().toString();

    return phrase.equals(reversedString);

  }
}
