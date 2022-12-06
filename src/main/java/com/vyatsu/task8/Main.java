package com.vyatsu.task8;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        System.out.println("1 task ");
        Staff[] staffs = new Staff[]{
                new Staff("Илья", 18, 140_000),
                new Staff("Илья", 54, 100_000),
                new Staff("Никита", 23, 90_000),
                new Staff("Степан", 20, 110_000),
                new Staff("Василий", 19, 180_000),
                new Staff("Илья", 36, 120_000),
                new Staff("Артем", 78, 280_000),
                new Staff("Степан", 22, 110_000),
                new Staff("Степан", 21, 110_000)
        };
        System.out.println(Arrays.stream(staffs)
                .map(s -> s.name)
                .collect(Collectors
                        .groupingBy(String::valueOf, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map
                        .Entry
                        .comparingByValue())
                .get()
                .getKey());

        //System.out.println(wordsByCount);

        //System.out.println(wordsByCount.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());

        System.out.println(" 2 task ");
        System.out.println(Arrays.stream(staffs).collect(Collectors.averagingDouble(Staff::getMoney)));
        System.out.println();

        System.out.println("3 task");
        workers(3,staffs);
    }

    static public void workers(int n, Staff[] x) {
        System.out.println(Arrays.stream(x)
                .sorted((i1, i2) -> i2.age - i1.age)
                .map(Worker -> Worker.name)
                .limit(n)
                .collect(Collectors
                        .joining(" , ", n + " самых старших сотрудников зовут ", ";")));
    }
}
