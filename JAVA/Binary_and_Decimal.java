import java.util.*;

public class BinDec {

    public static void BintoDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int temp = binNum;
        while (temp > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (lastdigit * (int) Math.pow(2, pow));
            pow++;
            temp /= 10;
        }
        System.out.println("Decimal of " + binNum + " is " + decNum);
    }

    public static void DectoBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        int temp = decNum;
        while (temp > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            temp /= 2;
        }
        System.out.println("Decimal of " + decNum + " is " + binNum);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.println("Enter a binary number ");
            // int binNum = sc.nextInt();
            // BintoDec(binNum);
            System.out.println("Enter a decimal number ");
            int decNum = sc.nextInt();
            DectoBin(decNum);
        }

    }
}
