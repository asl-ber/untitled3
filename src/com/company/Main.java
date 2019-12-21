package com.company;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        User Personal1 = new User("gkel", "12345", "barbarian");
        System.out.println(Personal1);

        User Personal2 = new User ("rad", "42342", "knight");
        System.out.println(Personal2);

        if (Personal1 == Personal2){
            System.out.println("одинаковы");
        } else {
            System.out.println("не одинаковы");
        }

        int [] arrayint = {1, 3, 5, 7, 9, 11, 20};
        int [] newArray = new int [arrayint.length*4];
        System.arraycopy(arrayint, 0, newArray, 0, arrayint.length);
        System.out.println(Arrays.toString(arrayint));
        System.out.println(Arrays.toString(newArray));

        //---------------------------------------------

        String str1 = new String("Hello Word!");
        String str2 = new String("My name is Aslan");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Kazakhstan");

        LinkedList<String> newList = new LinkedList<>();
        newList.add(str1);
        newList.add(str3);
        newList.add(str3);
        newList.add(str4);

        System.out.println(newList);

    }
}
