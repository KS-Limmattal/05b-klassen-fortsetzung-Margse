public class Fraction {
    private static int numberOfFractions;
    private int numerator, denominator;

    public static int getNumberOfFractions() {
        return numberOfFractions;
    }

    public Fraction(int numerator, int denominator) {
        this.setValues(numerator, denominator);
        numberOfFractions++;
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return numerator + "";
        }
        if (numerator / denominator >= 1) {
            return numerator / denominator + " + " + numerator % denominator + "/" + denominator;
        }
        return numerator + "/" + denominator;
    }

    public Fraction(Fraction f) {
        this(f.numerator, f.denominator);
    }

    public Fraction() {
        this(0, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setValues(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        this.denominator = denominator;
        this.numerator = numerator;
        this.simplify();
    }

    public void add(Fraction f) {
        this.setValues(this.numerator * f.denominator + this.denominator *
                f.numerator, this.denominator * f.denominator);
    }

    public void add(int a) {
        this.add(new Fraction(a));
    }

    public static Fraction add(Fraction f, Fraction g) {
        Fraction sum = new Fraction(f);
        sum.add(g);
        return sum;
    }

    public static Fraction add(int f, Fraction g) {
        return add(new Fraction(f), g);
    }

    public static Fraction add(Fraction f, int g) {
        return add(f, new Fraction(g));
    }

    public static Fraction add(int f, int g) {
        return add(new Fraction(f), new Fraction(g));
    }

    public void subtract(Fraction f) {
        f.setValues(-f.numerator, f.denominator);
        this.add(f);
    }

    public void subtract(int a) {
        this.subtract(new Fraction(a));
    }

    public static Fraction subtract(Fraction f, Fraction g) {
        Fraction sub = new Fraction(f);
        sub.subtract(g);
        return sub;
    }

    public static Fraction subtract(int f, Fraction g) {
        return subtract(new Fraction(f), g);
    }

    public static Fraction subtract(Fraction f, int g) {
        return subtract(f, new Fraction(g));
    }

    public static Fraction subtract(int f, int g) {
        return subtract(new Fraction(f), new Fraction(g));
    }

    public boolean equals(Fraction f) {
        return this.numerator * f.denominator == this.denominator * f.numerator;
    }

    public void multiply(Fraction f) {
        this.setValues(this.numerator * f.numerator, this.denominator * f.denominator);
    }

    public void multiply(int a) {
        this.multiply(new Fraction(a));
    }

    public static Fraction multiply(Fraction f, Fraction g) {
        Fraction prod = new Fraction(f);
        prod.multiply(g);
        return prod;
    }

    public static Fraction multiply(int f, Fraction g) {
        return multiply(new Fraction(f), g);
    }

    public static Fraction multiply(Fraction f, int g) {
        return multiply(f, new Fraction(g));
    }

    public static Fraction multiply(int f, int g) {
        return multiply(new Fraction(f), new Fraction(g));
    }

    public void divide(Fraction f) {
        Fraction div = new Fraction(f);
        div.setValues(f.denominator, f.numerator);
        this.multiply(div);
    }

    public void divide(int a) {
        this.divide(new Fraction(a));
    }

    public static Fraction divide(Fraction f, Fraction g) {
        Fraction div = new Fraction(f);
        div.multiply(g);
        return div;
    }

    public static Fraction divide(int f, Fraction g) {
        return divide(new Fraction(f), g);
    }

    public static Fraction divide(Fraction f, int g) {
        return divide(f, new Fraction(g));
    }

    public static Fraction divide(int f, int g) {
        return divide(new Fraction(f), new Fraction(g));
    }

    private void simplify() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
    }

    private int gcd(int first, int second) {
        if (first % second == 0) {
            return second;
        }
        return gcd(second, first % second);
    }

}
