import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger n1 = new BigInteger("0");
        BigInteger n2 = new BigInteger("1");
        BigInteger t;

        while(true) {
            t = n2;
            n2 = n1.add(n2);
            n1 = t;
            if (n2.toString().length() == 1000) {
                System.out.println(n2.toString());
                break;
            }
        }
    }
}
