package com.company;

import java.util.List;

public class SumAndReduce {

    //Sum all elements of a collection, try to use the reduce operator with identity parameter instead of an IntStream
    public static int calculate(List<Integer> numbers) {
       return numbers.stream().reduce((a,b)->a+b).orElse(0);
    }
}
