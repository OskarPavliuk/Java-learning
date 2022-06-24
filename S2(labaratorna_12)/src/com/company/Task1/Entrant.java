package com.company.Task1;

import java.util.Objects;

public class Entrant {
    private final String surname;
    private final int points;

    public Entrant(String surname, int points) {
        this.surname = surname;
        this.points = points;
    }

    public String getSurname() {
        return surname;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Entrant) obj;
        return Objects.equals(this.surname, that.surname) &&
                this.points == that.points;
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, points);
    }

    @Override
    public String toString() {
        return "Entrant[" +
                "surname=" + surname + ", " +
                "points=" + points + ']';
    }

}
