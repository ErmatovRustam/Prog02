import java.math.*;

public class Rational {
    public static final Rational ZERO = new Rational();

    private BigInteger num;
    private BigInteger den;

    public static Rational parse(String line) {
        int index = line.indexOf("/");
        if (index == -1) {
            BigInteger tnum = new BigInteger(line);
            return new Rational(tnum, BigInteger.ONE);
        }
        BigInteger tnum = new BigInteger(line.substring(0, index));
        BigInteger tden = new BigInteger(line.substring(index + 1));
        return new Rational(tnum, tden);
    }

    public Rational() {
        this(new BigInteger("0"), new BigInteger("1"));
    }

    public Rational(BigInteger num, BigInteger den) {

        if (den.equals(BigInteger.ZERO)) {
            throw new RuntimeException("Division by zero:");
        }
        if (den.compareTo(BigInteger.ZERO) < 0) {
            num = num.negate();
            den = den.negate();
        }
        this.num = num;
        this.den = den;

        BigInteger d = num.gcd(this.den);
        this.num = this.num.divide(d);
        this.den = this.den.divide(d);
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
    public Rational add(Rational other) {
        BigInteger tnum = num.multiply(other.den).add(other.den.multiply(num));
        BigInteger tden = den.multiply(other.den);
        return new Rational(tnum, tden);
    }

    public Rational substract(Rational other) {
        BigInteger tnum = num.multiply(other.den).subtract(other.den.multiply(num));
        BigInteger tden = den.multiply(other.den);
        return new Rational(tnum, tden);

    }

    public Rational multiply(Rational other) {
        BigInteger tnum = num.multiply(other.num);
        BigInteger tden = den.multiply(other.den);
        return new Rational(tnum, tden);
    }

    public Rational divide(Rational other) {
        if (other.num.equals(BigInteger.ZERO)) {
            throw new RuntimeException("Rational: Division by zero");
        }

        BigInteger tnum = num.multiply(other.den);
        BigInteger tden = den.multiply(other.num);
        return new Rational(tnum, tden);
    }

}