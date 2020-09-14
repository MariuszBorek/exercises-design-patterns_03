import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("selsect country");
        int num = in.nextInt();

        TaxOffice taxOffice = new TaxOffice();
        switch (num) {
            case 1: {
                taxOffice.setTax(new TaxPL());
                break;
            }
            case 2: {
                taxOffice.setTax(new TaxDE());
                break;
            }
            case 3: {
                taxOffice.setTax(new TaxUSA());
                break;
            }
        }
        double tax = taxOffice.countTax(100);
        System.out.println(tax);
    }
}
