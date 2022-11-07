import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the money in USD");

        Scanner sc = new Scanner(System.in);
        long usd = sc.nextLong();

        long vnd = usd * 23000;

        System.out.println("$" + usd + " = " + vnd + " VND");
    }
}