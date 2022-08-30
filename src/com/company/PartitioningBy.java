package com.company;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningBy {
    //Partition these people into adults and kids, you'll need a special collector for this one
    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
        return people.stream().collect(Collectors.partitioningBy(t->t.getAge()>=18));
    }
}
