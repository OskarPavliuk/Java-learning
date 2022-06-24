package com.company;

import java.util.Comparator;
import java.util.Objects;

public final class Student extends Human {
    private final String group;

    public Student(String name, String surname, String group, int years) {
        super(name, surname, years);
        this.group = group;
    }

    public Student(String name, String surname, int years) {
        super(name, surname, years);
        this.group = "Personal scheduale";
    }

    public String getGroup() {
        return group;
    }

    public String learn() {
        //1
        ComparatorByGroup comparator = new ComparatorByGroup();
        return "Вчить щось";
    }

    public String learn(String key) {
        return "Вчить " + key;
    }

    public Student newGroup(String secGroup) {
        return new Student(getName(), getSurname(), secGroup, getYears());

    }

    static class ComparatorByGroup implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.group.compareTo(o2.group);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Group: " +
                group;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), group);
    }
}
