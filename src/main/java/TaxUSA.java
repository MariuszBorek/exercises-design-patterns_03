public class TaxUSA implements Tax {
    @Override
    public double count(double amount) {
        return amount * (15/100d);
    }
}
