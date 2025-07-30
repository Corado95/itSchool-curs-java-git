package org.example.session17;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        System.out.println("-------------------");

        int [] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        System.out.println("elements from array:" + Arrays.toString(array));

        System.out.println("-------------------");

        for  (int i = 0; i < 5; i++) {

            System.out.println("elemente from array at position " + i + " with valure " + array[i] );

        }

        System.out.println("-------------------");

        for (int value : array) {
            System.out.println("element from array: " + value);
        }

        System.out.println("-------------------");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println(arrayList);
        System.out.println("---------Add----------");
        arrayList.add(1, 15);
        System.out.println("elements from ArrayList: " + arrayList);
        System.out.println(arrayList);
        System.out.println("--------Remove-----------");
        arrayList.remove(2);
        System.out.println(arrayList);
    }
}
