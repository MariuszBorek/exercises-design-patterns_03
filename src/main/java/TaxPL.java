public class TaxPL implements Tax {
    @Override
    public double count(double amount) {
        return amount * (23/100d);
    }
}
