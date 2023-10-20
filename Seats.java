public class Seats extends FurnitureProduct{

    private float loadCapacity;

    public Seats(int ID, String name, float price, int stockQuantity, double tax, Type productType, String materialType, ScreenDimension dimensions, float loadCapacity) {
        super(ID, name, price, stockQuantity, tax, productType, materialType, dimensions);
        this.loadCapacity = loadCapacity;
    }

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(float loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

@Override
public String toString() {
    return super.toString() +
            "\tloadCapacity: " + loadCapacity;
    }
}
