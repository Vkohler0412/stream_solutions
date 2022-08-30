package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    //Return a comma-separated string of all these people's names
    public static String namesToString(List<Person> people) {
        return people.stream().map(Person::getName).collect(Collectors.joining(","));
    }
}
