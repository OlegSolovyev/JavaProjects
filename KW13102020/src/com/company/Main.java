package com.company;

import java.util.Arrays;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        String s1 = "hi what are you doing?";
        Function<String,String> f1 = (s) -> {
            String[] strings= s.split(" ");
            String res= "";
            for (int i=0; i<strings.length; i++){
                if (strings[i].length()==3){
                    strings[i]=strings[i].toUpperCase();
                }
                res+=strings[i]+" ";
            }
            return res;
        };
        System.out.println(f1.apply(s1));
    }
}
