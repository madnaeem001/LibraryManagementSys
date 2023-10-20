public class Tables extends FurnitureProduct{

    private String shape;

    public Tables(int ID, String name, float price, int stockQuantity, double tax, Type productType, String materialType, ScreenDimension dimensions, String shape) {
        super(ID, name, price, stockQuantity, tax, productType, materialType, dimensions);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

@Override
public String toString() {
    return super.toString()+
            "\tshape: " + shape ;
}
}
