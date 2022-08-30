package com.company;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {

    //Group these people by nationality, same kind as the previous exercise

    public static Map<String, List<Person>> groupByNationality(List<Person> people) {
        return people.stream().collect(Collectors.groupingBy(Person::getNationality));
    }
}
