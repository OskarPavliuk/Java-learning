package com.company.Task3;

import com.company.Task1.Entrant;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Entrant> entrants = new LinkedList<Entrant>();

        entrants.add(new Entrant("Pavliuk", 60));
        entrants.add(new Entrant("Snitch", 67));
        entrants.add(new Entrant("Bounce", 80));
        entrants.add(new Entrant("Oskar", 100));
        entrants.add(new Entrant("Daniel", 61));
        entrants.add(new Entrant("Pasha", 62));
        entrants.add(new Entrant("Van4e", 63));
        entrants.add(new Entrant("Bonya", 70));
        entrants.add(new Entrant("Lukas", 57));
        entrants.add(new Entrant("Ronald", 33));
        entrants.add(new Entrant("Moment", 40));
        int budgetPlaces = 3;
        int contractPlaces = 4;
        entrants.stream()
                .sorted((Comparator.comparingInt(Entrant::getPoints).reversed()))
                .skip(budgetPlaces + contractPlaces)
                .map(Entrant::getSurname)
                .sorted(Comparator.comparing(String::toString))
                .forEach(System.out::println);
    }
}
