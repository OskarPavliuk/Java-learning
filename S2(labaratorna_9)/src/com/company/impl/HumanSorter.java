package com.company.impl;

import classes.Human;

import java.util.Comparator;

public interface HumanSorter {
        Comparator<Human> sorterForTask1();

        Comparator<Human> sorterForTask2();

        Comparator<Human> sorterForTask3();

        Comparator<Human> sorterForTask4();
    }
