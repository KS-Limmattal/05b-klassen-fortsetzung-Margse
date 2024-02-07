public class FractionTester {
    final double PI = 3.14159;

    public static void main(String[] args) {
        Fraction f = new Fraction();
        Fraction h = new Fraction(2, 1);
        // Der folgende Code funktioniert nur, wenn die Felder von Fraction nicht privat
        // sind:
        f.setValues(12, 1);
        System.out.println(f.getNumerator() + "/" + f.getDenominator());

        // toString():
        System.out.println(f.toString());
        // Encapsulation, Getter und Setter:
        f.setValues(24, 12);
        System.out.println(f.toString());
        // Copy-Konstruktor und equals():
        Fraction g = new Fraction(f);
        System.out.println(g.equals(f));
        System.out.println(g == f ? true : false);
        System.out.println(g.equals(h));
        // Klassen- und Instanzenmethoden:
        f.add(g);
        System.out.println(f.toString());
        System.out.println(Fraction.add(f, g));
        // statische Variablen:
        System.out.println(Fraction.getNumberOfFractions());

        g.setValues(25, 8);
        System.out.println(g.toString());
    }

}
