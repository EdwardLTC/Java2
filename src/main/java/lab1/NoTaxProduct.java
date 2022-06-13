package lab1;

public class NoTaxProduct extends product{

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public double getImportTax(){
        return 0;
    }
}
