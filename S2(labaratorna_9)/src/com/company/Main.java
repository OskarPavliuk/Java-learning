package com.company;

import classes.Human;
import classes.Student;
import com.company.impl.HumanSorter;
import com.company.impl.HumanSorterImpl;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Chumilo", "IA-13", 1);
        Student john = new Student("Sergey", "Chukmasov", "IA-12", 2);
        Student jack = new Student("Yarik", "Makarik", "IA-11", 3);
        Student daniel = new Student("Daniel", "Andrushko", 4);
        Student stuNull = null;
        HumanSorter humanSorter = new HumanSorterImpl();
        try {
            Student[] arrayOfStudents = new Student[]{ivan, john, jack, daniel};

            Arrays.sort(arrayOfStudents, humanSorter.sorterForTask1());
            System.out.println(Arrays.toString(arrayOfStudents) + "\n");

            Arrays.sort(arrayOfStudents, humanSorter.sorterForTask2());
            System.out.println(Arrays.toString(arrayOfStudents) + "\n");

            Set<Human> setOfHeadsForTask3 = new TreeSet<>(humanSorter.sorterForTask3());
            setOfHeadsForTask3.addAll(Set.of(ivan, john, jack, daniel));
            System.out.println(setOfHeadsForTask3 + "\n");

            Set<Human> setOfHeadsForTask4 = new TreeSet<>(humanSorter.sorterForTask4());
            setOfHeadsForTask4.addAll(Set.of(ivan, john, jack, daniel));
            setOfHeadsForTask4.add(stuNull);
            System.out.println(setOfHeadsForTask4);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    }
