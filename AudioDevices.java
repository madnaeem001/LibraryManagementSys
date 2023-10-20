public class AudioDevices extends ElectronicProduct {


    public AudioDevices(int ID, String name, float price, int stockQuantity, double tax, Type productType, double powerConsumption, int warranty) {
        super(ID, name, price, stockQuantity, tax, productType, powerConsumption, warranty);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
