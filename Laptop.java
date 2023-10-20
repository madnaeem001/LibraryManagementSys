public class Laptop extends ElectronicProduct{

    private String processorType;
    private int RAM;
    private ScreenDimension screenDimension;

    public Laptop(int ID, String name, float price, int stockQuantity, double tax, Type productType, double powerConsumption, int warranty, String processorType, int RAM, ScreenDimension screenDimension) {
        super(ID, name, price, stockQuantity, tax, productType, powerConsumption, warranty);
        this.processorType = processorType;
        this.RAM = RAM;
        this.screenDimension = screenDimension;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public ScreenDimension getScreenDimension() {
        return screenDimension;
    }

    public void setScreenDimension(ScreenDimension screenDimension) {
        this.screenDimension = screenDimension;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tprocessorType='" + processorType + '\'' +
                "\t RAMsize=" + RAM +
                "\t ScreenDimension=" + screenDimension;
    }

}
