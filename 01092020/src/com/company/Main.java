package com.company;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {

    public static void main(String[] args) {
        String str = "qwertrew.q";
        PredicatePalindrome predicatePalindrome = new PredicatePalindrome();
        System.out.println(predicatePalindrome.test(str));
    }
}
