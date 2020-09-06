package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionToString implements BiFunction<List<String>, Predicate<String>, List<String>> {
  /*  private Predicate predicate;
    @Override
    public List<String> apply(List<String> stringList) {
        List<String> res = new ArrayList<String>();
        if (stringList == null) return res;
        for (String s: stringList){
            if (predicate.test(s)){
                res.add(s);
            }
        }
        return null;
    }

    public FunctionToString(Predicate predicate) {
        this.predicate = predicate;
    }

   */

    @Override
    public List<String> apply(List<String> list, Predicate<String> predicate) {
        List<String> res = new ArrayList<>();
        if (list == null) return res;
        for (String s: list){
            if (predicate.test(s)){
                res.add(s);
            }
        }
        return res;
    }
}
