package com.company.Task2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student first = new Student("Oskar", "Pavliuk", 1, 100);
        Student second = new Student("Loscha", "Kvartuk", 2, 66);
        Student third = new Student("Losha", "Zadorozhniy", 3, 80);

        Faculty faculty1 = new Faculty("FIOT", List.of(first, second, third));

        Student fourth = new Student("Danilo", "Andrushko", 4, 99);
        Student fifth = new Student("Mark", "Melnuchenko", 5, 98);
        Student sixth = new Student("Oleksandr", "Mimona", 6, 97);

        Faculty faculty2 = new Faculty("Pr. Math.", List.of(fourth, fifth, sixth));

        Institute kpi = new Institute("KPI", List.of(faculty1, faculty2));

        Student seventh = new Student("Evgeniy", "Orlenos", 1, 90);
        Student eighth = new Student("Yarik", "Makarik", 2, 66);

        Faculty faculty3 = new Faculty("Pr. Inzheneria", List.of(seventh, eighth));

        Student ninth = new Student("Dima", "Kodinez", 3, 11);
        Student tenth = new Student("Vlad", "Pavlenko", 4, 75);

        Faculty faculty4 = new Faculty("eko", List.of(ninth, tenth));

        Institute shevchenko = new Institute("Shevchenko", List.of(faculty3, faculty4));

        List<Institute> institutes = new LinkedList<Institute>();
        institutes.add(kpi);
        institutes.add(shevchenko);

        institutes.stream()
                .flatMap(institute -> institute.faculties().stream())
                .flatMap(faculty -> faculty.students().stream())
                .sorted(
                        Comparator.comparing(Student::surname, String.CASE_INSENSITIVE_ORDER)
                                .thenComparing(Student::name, String.CASE_INSENSITIVE_ORDER)
                                .thenComparing(Student::average, Integer::compare)
                                .thenComparing(Student::number, Integer::compare)
                )
                .forEach(System.out::println);
    }
}
