package com.company;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicatePalindrome implements Predicate<String> {
    @Override
    public boolean test(String s) {
        if (s!=null) {

        char[] sToChars=s.toCharArray();
        char[] charsWithoutSpaces= new char[sToChars.length];
        int j=0;
        for (int i=0; i<sToChars.length; i++){
            if (sToChars[i]=='.'||sToChars[i]==','||sToChars[i]=='!'||sToChars[i]=='?'||sToChars[i]==' '||sToChars[i]=='<'||sToChars[i]=='>'||sToChars[i]=='+'||sToChars[i]=='='||sToChars[i]=='*'||sToChars[i]=='/'){
            } else {
                charsWithoutSpaces[j++]=sToChars[i];
            }
        }
            String sWithoutSpaces="";
        for (int i=0;i<j;i++){
            sWithoutSpaces+=charsWithoutSpaces[i];
        }
            boolean rev = new StringBuffer(sWithoutSpaces).reverse().toString().equalsIgnoreCase(sWithoutSpaces);
            return rev;
        }
        return false;
    }

}
