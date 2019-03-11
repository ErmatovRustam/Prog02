public class Rational {
    private int den;
    private int num;

    public static Rational parse(String line) {
        int index = line.indexOf('/');
        if (index == -1) {
            int tnum = Integer.parseInt(line);
            return new Rational(tnum, 1);
        }
        int tnum = Integer.parseInt(line.substring(0, index));
        int tden = Integer.parseInt(line.substring(index + 1));
        return new Rational(tnum, tden);
    }

    public Rational(int num, int den) {
        if (den == 0) {
            throw new RuntimeException("Negative denominator: ");
        }
        if (den < 0) {
            num = -num;
            den = -den;
        }

        this.num = num;
        this.den = den;

        int d = MathUtills.gcd(this.num, this.den);
        this.num /= d;
        this.den /= d;
    }
    @Override
    public String toString(){
        return num + "/" + den;
    }
    public Rational add(Rational other){
        int tnum = num * other.den + den * other.num;
        int tden = den * other.den;
        return new Rational(tnum, tden);
    }
    public Rational substract(Rational other){
        int tnum = num * other.den - den * other.num;
        int tden = den * other.den;
        return new Rational(tnum, tden);
    }
    public Rational multiply(Rational other){
        int tnum = num *  other.num;
        int tden = den * other.den;
        return new Rational(tnum, tden);
    }
    public Rational divide(Rational other){

        if(other.num==0){
            throw new RuntimeException("Division by zero");
        }
        int tnum = num * other.den;
        int tden = den * other.num;
        return new Rational(tnum, tden);
    }
}
