package com.company.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static List<String> transform(List<List<String>> collection) {
        return collection.stream().flatMap(t->t.stream()).collect(Collectors.toList());
    }
}
