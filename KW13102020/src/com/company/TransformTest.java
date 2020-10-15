package com.company;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;
import static com.company.Main.transform;

import static org.junit.jupiter.api.Assertions.*;

class TransformTest {
    @Test
    public void TransformPredicateTrueTest(){
        Predicate<String> predicate= (s) -> true;
        String string= "Hello";
        Function<String,String> function= (s) -> s+=" "+s;
        String result=transform(string,predicate,function);
        String expectedString = "Hello Hello";
        assertEquals(result,expectedString);

    }

    @Test
    public void TransformPredicateFalseTest(){
        Predicate<String> predicate= (s) -> false;
        String string= "Hello";
        Function<String,String> function= (s) -> s+=" "+s;
        String result=transform(string,predicate,function);
        String expectedString = "Hello";
        assertEquals(result,expectedString);

    }


}