
public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * faffa.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * faffa.
     */
    public void setNumerator(int num) {
        if (num != 0) {
            this.numerator = num;
        }
    }

    /**
     * faffa.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * faffa.
     */
    public void setDenominator(int deno) {
        if (deno != 0) {
            this.denominator = deno;
        }
    }

    /**
     * faffa.
     */

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * faffa.
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * faffa.
     */
    public Fraction(Fraction fraction) {
        this.numerator = fraction.numerator;
        if (fraction.denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = fraction.denominator;
        }
    }

    /**
     * faffa.
     */
    public Fraction reduce() {
        int temp = numerator;
        this.numerator = numerator / gcd(numerator, denominator);
        this.denominator = denominator / gcd(temp, denominator);
        return this;
    }

    /**
     * faffa.
     */
    public Fraction add(Fraction that) {
        this.numerator = this.getNumerator() * that.getDenominator() + this.getDenominator() * that.getNumerator();
        this.denominator = this.getDenominator() * that.denominator;
        this.reduce();
        return this;
    }

    /**
     * faffa.
     */
    public Fraction subtract(Fraction that) {
        this.numerator = this.getNumerator() * that.getDenominator() - this.getDenominator() * that.getNumerator();
        this.denominator = this.getDenominator() * that.denominator;
        this.reduce();
        return this;
    }

    /**
     * faffa.
     */
    public Fraction multiply(Fraction that) {
        this.numerator = this.getNumerator() * that.numerator;
        this.denominator = this.getDenominator() * that.denominator;
        this.reduce();
        return this;
    }

    /**
     * faffa.
     */
    public Fraction divide(Fraction that) {
        this.numerator = this.getNumerator() * that.denominator;
        this.denominator = this.getDenominator() * that.numerator;
        this.reduce();
        return this;
    }

    /**
     * faffa.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            if (((Fraction) obj).numerator * this.denominator == ((Fraction) obj).denominator * this.numerator) {
                return true;
            } else {
                return false;
            }
        } else return false;
    }


    /**
     * faffa.
     */
    public static int gcd(int a, int b) {
        int temp;
        while (b > 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}



