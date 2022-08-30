package com.company.streams;

import com.company.pojo.Person;

import java.util.List;

public class MaxAndComparator {

    //Get the oldest person from the collection
    public static Person getOldestPerson(List<Person> people) {
        return people.stream().reduce((a,b)->a.getAge()>b.getAge()?a:b).get();
    }
    //Get max age inside collection
    public static int getOldestAge(List<Person> people){
        return people.stream().mapToInt(t->t.getAge()).max().orElse(0);
    }
}
