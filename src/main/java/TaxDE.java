public class TaxDE implements Tax {
    @Override
    public double count(double amount) {
        return amount * (30/100d);
    }
}
