public class TaxOffice {
    private Tax tax;

    public double countTax(double amount) {
        return this.tax.count(amount);
    }
    public Tax getTax() {
        return tax;
    }
    public void setTax(Tax tax) {
        this.tax = tax;
    }
}
