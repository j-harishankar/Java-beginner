
import java.text.NumberFormat;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal: ");
        int principal = scanner.nextInt();
        System.out.print("Enter interest rate: ");
        float annual_interest = scanner.nextFloat();
        float monthly_interest = annual_interest / PERCENT/ MONTHS_IN_YEAR;
        System.out.println("Period(years)");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;
        double mortage = principal *
                (monthly_interest * Math.pow(1 + monthly_interest, numberOfPayments)) /
                (Math.pow(1 + monthly_interest, numberOfPayments) - 1);
        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println(mortageFormatted);

    }
}