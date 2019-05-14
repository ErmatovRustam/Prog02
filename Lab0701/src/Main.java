import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] ar = {10, 1, 15, 20, 5};
	Arrays.sort(ar);

        for(int i = 0; i< ar.length; i++) {
            System.out.println(ar[i] + " ");
        }

        String[] sar = {"apple", "lemon", "banana", "ananas"};
        Arrays.sort(sar);
        for(int i = 0; i< sar.length; i++) {
            System.out.println(sar[i] + " ");
        }
        BigInteger[] bar = {new BigInteger("15616915329684651"), new BigInteger("21654685131321"),
                new BigInteger("654198526815")};

        Arrays.sort(bar);
        for(int i = 0; i< bar.length; i++) {
            System.out.println(bar[i] + " ");
        }


        Rational[] ar3 = {Rational.parse("1/5"), Rational.parse("1/2"), Rational.parse("4/5")};
        Arrays.sort(ar3);

        for(int i = 0; i< ar3.length; i++){
            System.out.println(ar3[i] + " ");
        }
    }
}
