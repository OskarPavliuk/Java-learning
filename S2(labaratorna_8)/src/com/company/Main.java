package com.company;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {


        Student ivan = new Student("Ivan", "Chumilo", "IA-13", 1);
        Student john = new Student("Sergey", "Chukmasov", "IA-12", 2);
        Student jack = new Student("Yarik", "Makarik", "IA-11", 3);
        Student daniel = new Student("Daniel", "Andrushko", 4);
        try {
            Student[] students = new Student[]{ivan, john, jack, daniel};
            Arrays.sort(students, Human.sortedWithYears());
            System.out.println(Arrays.toString(students));
//2
            Set<Student> setOfStudents = new TreeSet<>(new Student.ComparatorByGroup());
            setOfStudents.addAll(List.of(students));
            System.out.println(setOfStudents);
            System.out.println(ivan.countyears() + "\n" + jack.countyears());
            Human.Countyears c = jack.new Countyears();
            System.out.println(c.calculate());
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }}
