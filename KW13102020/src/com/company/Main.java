package com.company;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<String> predicate1= (s) -> s.length()==3;
        Predicate<String> predicate2= (s) -> s.length()==5;
        Predicate<String> predicate3= (s) -> s.length()%2==0;
        Predicate<String> predicate13= (s) -> predicate1.test(s)||predicate3.test(s);
        Function<String,String> function1= String::toLowerCase;
        Function<String, String> function2= String::toUpperCase;
        String s1 = "hi what are you doing?";
        Function<String,String> f1 = (s) -> {
            String[] strings= s.split(" ");
            for (int i=0; i<strings.length; i++){
                if (predicate1.test(strings[i])){
                    function2.apply(strings[i]);
                }
            }
            return String.join(" ",strings);
        };

        System.out.println(f1.apply(s1));
    }

    public static String transform(String s, Predicate<String> p, Function<String,String> f){
        String[] strings= s.split(" ");
        for (int i=0; i<strings.length; i++){
            if (p.test(strings[i])){
                strings[i]=f.apply(strings[i]);
            }
        }
        return String.join(" ",strings);
    }
}
