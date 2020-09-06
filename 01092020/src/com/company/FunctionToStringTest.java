package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FunctionToStringTest {
    @Test
    public void apply_nullList_emptyList(){
        String str = null;
        FunctionToString function= new FunctionToString();
        List<String> str1 = new ArrayList<>();
        assertEquals(function.apply(null, new PredicatePalindrome()), str1);
    }

    @Test
    public void apply_palindromeList_palindromeList(){
      List<String> listOut = new ArrayList<>();
      listOut.add("qweewq");
      listOut.add("qwerewq");
      listOut.add("qwertrewq");

      List<String> listIn = new ArrayList<>();
        listIn.add("qweewq");
        listIn.add("qwerewq");
        listIn.add("qwertrewq");
      
      listIn.add("asd");
      listIn.add("asdg");
      FunctionToString function= new FunctionToString();
      assertEquals(listOut,function.apply(listIn, new PredicatePalindrome()));
    }

    @Test
    public void apply_noPalindromeList_palindromeList(){
        List<String> listOut = new ArrayList<>();

        List<String> listIn = new ArrayList<>();
        listIn.add("asdd");
        listIn.add("asd");
        listIn.add("asdg");
        FunctionToString function= new FunctionToString();
        assertEquals(listOut,function.apply(listIn, new PredicatePalindrome()));
    }

}