package com.company;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;


public class TestClass {

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = new ArrayList<>();
        collection.add(Arrays.asList("Viktor", "Farcic"));
        collection.add(Arrays.asList("John", "Doe", "Third"));
        List<String> expected = new ArrayList<>(Arrays.asList("Viktor", "Farcic", "John", "Doe", "Third"));
        Assert.assertTrue(FlatMap.transform(collection).containsAll(expected));
    }

    @Test
    public void getOldestPersonShouldReturnOldestPerson() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = new ArrayList<>(Arrays.asList(sara, eva, viktor));
        Assert.assertEquals(MaxAndComparator.getOldestPerson(collection),eva);
    }


    @Test
    public void calculateShouldSumAllNumbers() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertTrue(SumAndReduce.calculate(numbers)==(1 + 2 + 3 + 4 + 5));
    }
    @Test
    public void getKidNameShouldReturnNamesOfAllKidsUnder18() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = new ArrayList<>(Arrays.asList(sara, eva, viktor, anna));
        Set<String> test = UnderAge.getKidNames(collection);
        Assert.assertTrue(test.stream().allMatch(t->t.equals("Sara")||t.equals("Anna")));
        Assert.assertTrue(test.stream().noneMatch(t->t.equals("Eva")||t.equals("Viktor")));
    }

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = new ArrayList<>(Arrays.asList(sara, eva, viktor));
        Map<Boolean, List<Person>> result = PartitioningBy.partitionAdults(collection);
        Assert.assertTrue(result.get(true).stream().allMatch(t->t.equals(viktor)||t.equals(eva)));
        Assert.assertTrue(result.get(false).containsAll(new ArrayList<>(Arrays.asList(sara))));
    }

    @Test
    public void groupByNationalityTest() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Viktor", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = new ArrayList<>(Arrays.asList(sara, eva, viktor));
        Map<String, List<Person>> result = GroupBy.groupByNationality(collection);
        Assert.assertTrue(result.get("Norwegian").stream().allMatch(t->t.equals(eva)||t.equals(sara)));
        Assert.assertTrue(result.get("Serbian").stream().anyMatch(t->t.equals(viktor)));
    }
    @Test
    public void toStringShouldReturnPeopleNamesSeparatedByComma() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = new ArrayList<>(Arrays.asList(sara, viktor, eva));
        Assert.assertTrue(Joining.namesToString(collection).equals("Sara,Viktor,Eva"));

    }



}
