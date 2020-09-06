package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredicatePalindromeTest {
    @Test
    public void test_isPalindrome_true(){
        String str = "qwertrew.q";
        String str1 = "qw.errewq";
        PredicatePalindrome predicatePalindrome = new PredicatePalindrome();
        assertTrue(predicatePalindrome.test(str));
        assertTrue(predicatePalindrome.test(str1));
    }

    @Test
    public void test_notPalindrome_false(){
        String str = "qwerty";
        String str1 = "qwert";
        PredicatePalindrome predicatePalindrome = new PredicatePalindrome();
        assertFalse(predicatePalindrome.test(str));
        assertFalse(predicatePalindrome.test(str1));
    }

    @Test
    public void test_nullString_false(){
        String str = null;
        PredicatePalindrome predicatePalindrome = new PredicatePalindrome();
        assertFalse(predicatePalindrome.test(str));
    }

    @Test
    public void test_emptyString_true(){
        String str = "";
        PredicatePalindrome predicatePalindrome = new PredicatePalindrome();
        assertTrue(predicatePalindrome.test(str));
    }




}