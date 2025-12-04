package org.example;


public class Main {
    public static void main(String[] args) {
        Palindromes object = new Palindromes();
        boolean bool = object.isPalindromeIgnoreSpaces("race car");
        System.out.println(bool);
    }
}