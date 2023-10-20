public class FurnitureProduct extends Product{

    private String materialType;

    private ScreenDimension dimensions;

    public FurnitureProduct(int ID, String name, float price, int stockQuantity, double tax, Type productType, String materialType, ScreenDimension dimensions) {
        super(ID, name, price, stockQuantity, tax, productType);
        this.materialType = materialType;
        this.dimensions = dimensions;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public ScreenDimension getDimensions() {
        return dimensions;
    }

    public void setDimensions(ScreenDimension dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\tmaterial: " + materialType +
                " \tdimension: " + dimensions ;
    }

}
