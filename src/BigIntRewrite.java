import java.math.BigInteger;

public class BigIntRewrite {
    public static BigInteger pow(int x, int n) {
        BigInteger result = BigInteger.ONE;
        BigInteger number = BigInteger.valueOf(x);

        while (n > 0) {
            if (n % 2 == 1) {
                result = result.multiply(number);
            }
            number = number.multiply(number);
            n /= 2;
        }


        return result;
    }

    public static void main(String[] args) {

        int number = 2;
        int exponent = 10;
        BigInteger result = pow(number, exponent);

        System.out.println(number + " raised to the power of " + exponent + " is: " + result);
    }
}
