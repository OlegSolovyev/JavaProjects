package com.company;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static com.company.Main.transform;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TransformTest {
    @Test
    public void TransformPredicate3TrueTest(){
        Predicate<String> predicate= (s) -> s.length()==3;
        Function<String, String> function= String::toUpperCase;
        String str="Hello";
        String result = transform(str, predicate, function);
        assertEquals(result,"HELLO");
    }

    @Test
    public void TransformPredicate3FalseTest(){
        Predicate<String> predicate= (s) -> s.length()==3;
        Function<String, String> function= String::toUpperCase;
        String str="Hi";
        String result = transform(str, predicate, function);
        assertEquals(result,"Hi");
    }

    @Test
    public void TransformPredicate5TrueTest(){
        Predicate<String> predicate= (s) -> s.length()==5;
        Function<String, String> function= String::toUpperCase;
        String str="HELLO";
        String result = transform(str, predicate, function);
        assertEquals(result,"hello");
    }

    @Test
    public void TransformPredicate5FalseTest(){
        Predicate<String> predicate= (s) -> s.length()==5;
        Function<String, String> function= String::toLowerCase;
        String str="HI";
        String result = transform(str, predicate, function);
        assertEquals(result,"HI");
    }


}