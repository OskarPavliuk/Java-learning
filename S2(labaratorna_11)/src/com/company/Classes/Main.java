package com.company.Classes;

import com.company.HumanCon;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Chumilo", "IA-13", 1);
        Student john = new Student("Sergey", "Chukmasov", "IA-12", 2);
        Student jack = new Student("Yarik", "Makarik", "IA-11", 3);
        try {
            HumanCon humanCon = Human::new;
            System.out.println(humanCon.get("Oskar", "Pavliuk", 18));
            List<Student> students = new ArrayList<>();
            students.add(ivan);
            students.add(john);
            students.add(jack);
            students.stream()
                    .filter(Student::сount)
                    .sorted(Student::nameComparing)
                    .forEach(System.out::println);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
