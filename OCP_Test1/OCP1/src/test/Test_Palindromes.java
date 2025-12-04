package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit Tests for Challenge 3: Palindrome Detection & Analysis
 * <p>
 * These tests validate palindrome operations:
 * - Simple palindrome detection
 * - Case-insensitive palindrome with spaces
 * - Finding longest palindrome substring
 * - Counting palindrome substrings
 */
public class Test_Palindromes {

  private Palindromes challenge;

  @BeforeEach
  void setUp() {
    challenge = new Palindromes();
  }

  // ==================== METHOD 2: isPalindromeIgnoreSpaces() TESTS ====================

  @Test
  @DisplayName("Test 2.1: Palindrome with spaces - race car")
  void testIsPalindromeIgnoreSpacesRaceCar() {
    assertTrue(challenge.isPalindromeIgnoreSpaces("race car"));
  }

  @Test
  @DisplayName("Test 2.2: Famous palindrome - A man a plan a canal Panama")
  void testIsPalindromeIgnoreSpacesPanama() {
    assertTrue(challenge.isPalindromeIgnoreSpaces("A man a plan a canal Panama"));
  }

  @Test
  @DisplayName("Test 2.3: Palindrome phrase - Was it a car or a cat I saw")
  void testIsPalindromeIgnoreSpacesCatCar() {
    assertTrue(challenge.isPalindromeIgnoreSpaces("Was it a car or a cat I saw"));
  }

  @Test
  @DisplayName("Test 2.4: Not palindrome with spaces - hello world")
  void testIsNotPalindromeIgnoreSpacesHelloWorld() {
    assertFalse(challenge.isPalindromeIgnoreSpaces("hello world"));
  }

  @Test
  @DisplayName("Test 2.5: Case insensitive - Radar")
  void testIsPalindromeIgnoreSpacesCaseInsensitive() {
    assertTrue(challenge.isPalindromeIgnoreSpaces("Radar"));
    assertTrue(challenge.isPalindromeIgnoreSpaces("Level"));
  }

  @Test
  @DisplayName("Test 2.6: Multiple spaces")
  void testIsPalindromeIgnoreSpacesMultipleSpaces() {
    assertTrue(challenge.isPalindromeIgnoreSpaces("race  car"));
    assertTrue(challenge.isPalindromeIgnoreSpaces("a   b   a"));
  }

  @Test
  @DisplayName("Test 2.7: Leading and trailing spaces")
  void testIsPalindromeIgnoreSpacesLeadingTrailing() {
    assertTrue(challenge.isPalindromeIgnoreSpaces("  radar  "));
    assertTrue(challenge.isPalindromeIgnoreSpaces("  race car  "));
  }

  @Test
  @DisplayName("Test 2.8: Only spaces")
  void testIsPalindromeIgnoreSpacesOnlySpaces() {
    assertTrue(challenge.isPalindromeIgnoreSpaces("   "));
  }

  @Test
  @DisplayName("Test 2.9: Single word (no spaces)")
  void testIsPalindromeIgnoreSpacesSingleWord() {
    assertTrue(challenge.isPalindromeIgnoreSpaces("racecar"));
    assertFalse(challenge.isPalindromeIgnoreSpaces("hello"));
  }

  @Test
  @DisplayName("Test 2.10: Mixed case with spaces")
  void testIsPalindromeIgnoreSpacesMixedCase() {
    assertTrue(challenge.isPalindromeIgnoreSpaces("RaCe CaR"));
    assertTrue(challenge.isPalindromeIgnoreSpaces("A B A"));
  }

  @Test
  @DisplayName("Test 2.11: Empty string")
  void testIsPalindromeIgnoreSpacesEmpty() {
    assertTrue(challenge.isPalindromeIgnoreSpaces(""));
  }

  @Test
  @DisplayName("Test 2.12: Single character with spaces")
  void testIsPalindromeIgnoreSpacesSingleCharWithSpaces() {
    assertTrue(challenge.isPalindromeIgnoreSpaces(" a "));
  }
}
