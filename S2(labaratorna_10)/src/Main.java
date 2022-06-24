import Task1.Calculator;
import Task1.impl.CalculatorImpl;
import Task2.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        double a = 1, b = 2, c = 3, d = 0.5, e = 2.7;
        Calculator calculator = new CalculatorImpl(a, b, c, d, e);
        try {
            System.out.println("First: " + calculator.first());
            System.out.println("Second: " + calculator.second());
            System.out.println("Third: " + calculator.third());
        } catch (NullPointerException | IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }


        Student ivan = new Student("Ivan", "Chumilo", "IA-13", 1);
        Student john = new Student("Sergey", "Chukmasov", "IA-12", 2);
        Student jack = new Student("Yarik", "Makarik", "IA-11", 3);
        Student daniel = new Student("Daniel", "Andrushko", 4);

        try {
            List<Student> students = new ArrayList<>();
            students.add(ivan);
            students.add(john);
            students.add(jack);
            students.add(daniel);
            students.forEach((student -> System.out.println(students)));
        } catch (NullPointerException | IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
