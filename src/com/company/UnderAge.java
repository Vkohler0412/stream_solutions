package com.company;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UnderAge {

    //Get the names of all kids under the age of 18
    public static Set<String> getKidNames(List<Person> people) {
        return  people.stream().filter(t->t.getAge()<18).map(t->t.getName()).collect(Collectors.toSet());
    }

}
