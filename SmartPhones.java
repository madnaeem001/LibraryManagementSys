public class SmartPhones extends ElectronicProduct{

    private String operatingSys;
    private int ROM;
    private int cameraResolution;

    public SmartPhones(int ID, String name, float price, int stockQuantity, double tax, Type productType, double powerConsumption, int warranty, String operatingSys, int ROM, int cameraResolution) {
        super(ID, name, price, stockQuantity, tax, productType, powerConsumption, warranty);
        this.operatingSys = operatingSys;
        this.ROM = ROM;
        this.cameraResolution = cameraResolution;
    }

    public String getOperatingSys() {
        return operatingSys;
    }

    public void setOperatingSys(String operatingSys) {
        this.operatingSys = operatingSys;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

@Override
public String toString() {
    return super.toString() +
            "operatingSystem='" + operatingSys + '\'' +
            ", storage=" + ROM +
            ", resolution=" + cameraResolution ;
}

}
