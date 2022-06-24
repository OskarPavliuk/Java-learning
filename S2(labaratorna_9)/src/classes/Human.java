package classes;
import java.util.Objects;

    public class Human {
        private final String name;
        private final String surname;
        private final int years;

        public Human(String name, String surname, int years) {
            this.name = name;
            this.surname = surname;
            this.years = years;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public int getYears() {
            return years;
        }

        @Override
        public String toString() {
            return "Name: " + name + " Surname: " + surname + " years: " + years;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Human human = (Human) o;
            return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(years, human.years);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, years);
        }
    }
