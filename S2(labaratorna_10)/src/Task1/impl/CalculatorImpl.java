package Task1.impl;

import Task1.Calculator;
import Task1.MyMath;

import static java.lang.Math.*;

public class CalculatorImpl implements Calculator {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;

    public CalculatorImpl(double a, double b, double c, double d, double e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public double first() {
        MyMath myMath = (a, b, c, d, e) ->
                ((5 * a / sin(a)) + sqrt(tan(abs(b) * c) / log(d)));
        return myMath.calculate(a, b, c, d, e);
    }

    public double second() {
        MyMath myMath =
                (a, b, c, d, e) -> ((pow(e, c) + 2 * log10(a)) / (sqrt(pow(c, b))) * abs(asin(d)));
        return myMath.calculate(a, b, c, d, e);
    }

    public double third() {
        MyMath myMath =
                (a, b, c, d, e) -> (2 * (log(b / a) + sqrt(sinh(c) + pow(e, d))));
        return myMath.calculate(a, b, c, d, e);
    }
}
