public class ElectronicProduct extends Product {

    private double powerConsumption;
    private int warranty;

    public ElectronicProduct(int ID, String name, float price, int stockQuantity, double tax, Type productType, double powerConsumption, int warranty) {
        super(ID, name, price, stockQuantity, tax, productType);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tpowerConsumption='" + powerConsumption + '\'' +
                "\t warranty: " + warranty;



    }
}
