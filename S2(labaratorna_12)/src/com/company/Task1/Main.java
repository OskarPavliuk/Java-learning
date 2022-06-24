package com.company.Task1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Entrant> entrants = new LinkedList<Entrant>();

        entrants.add(new Entrant("A", 60));
        entrants.add(new Entrant("B", 67));
        entrants.add(new Entrant("C", 80));
        entrants.add(new Entrant("D", 100));
        entrants.add(new Entrant("E", 61));
        entrants.add(new Entrant("F", 62));
        entrants.add(new Entrant("G", 63));
        entrants.add(new Entrant("H", 70));
        entrants.add(new Entrant("I", 57));
        entrants.add(new Entrant("J", 33));
        entrants.add(new Entrant("K", 40));

        int budgetPlaces = 3;
        int contractPlaces = 4;

        entrants.stream()
                .filter(entrant -> entrant.getPoints() >= 60)
                .sorted((Comparator.comparingInt(Entrant::getPoints).reversed()))
                .skip(budgetPlaces)
                .limit(contractPlaces)
                .sorted(Comparator.comparing(Entrant::getSurname, String.CASE_INSENSITIVE_ORDER))
                .forEach(System.out::println);
    }
}