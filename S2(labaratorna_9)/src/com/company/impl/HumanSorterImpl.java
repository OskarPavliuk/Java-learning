package com.company.impl;

import classes.Human;

import java.util.Comparator;

public class HumanSorterImpl implements HumanSorter {
    public Comparator<Human> sorterForTask1() {
        return (o1, o2) -> o1.getYears() - o2.getYears();
    }

    public Comparator<Human> sorterForTask2() {
        return sorterForTask1().reversed();
    }

    public Comparator<Human> sorterForTask3() {
        return sorterForTask1().thenComparing((o1, o2) -> o2.getName().compareTo(o1.getName()));
    }

    public Comparator<Human> sorterForTask4() {
        return Comparator.nullsLast(sorterForTask3());
    }
}
