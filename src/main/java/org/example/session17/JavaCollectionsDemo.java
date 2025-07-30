package org.example.session17;

import java.util.*;

public class JavaCollectionsDemo {
    public static void main(String[] args) {
        listDemo();
        setDemos();


    }

    public static void listDemo() {
        List<Integer> numbers  = new ArrayList<>();
        for (int i = 0; i < 5; i++ ){
            numbers.add(i * 10);

        }
        System.out.println(numbers);

        numbers.add(3,25);
        System.out.println(numbers);



    }

    enum Day {LUNI, MARTI, MIERCURI, JOI, VINERI, SAMBATA, DUMINICA}

    public static void setDemos() {
        Set<String> students = new HashSet<>();
        students.add("John");
        students.add("Jane");
        students.add("Jack");
        students.add("John");
        System.out.println(students);

        System.out.println("------------REMOVE AND CHECK CONTAINS-----------------");

        students.remove("Jack");
        System.out.println(students);
        System.out.println(students.contains("Jack"));

        System.out.println("------------SET RANGE FOR ENUM SET-----------------");

        EnumSet<Day> days = EnumSet.range(Day.LUNI, Day.VINERI);
        System.out.println(days);

        System.out.println("------------ ADD IN ENUM-----------------");

        days.add(Day.DUMINICA);
        System.out.println(days);




    }


}
