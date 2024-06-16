package factoryPattern;

public class ProductFactory {
    public static Product getInstance(EnumProductType productType) {
        switch (productType) {
            case PHYSICAL:
                Product physicalProduct = new PhysicalProduct();
                physicalProduct.setProductType(productType);
                return physicalProduct;
            case DIGITAL:
                Product digitalProduct = new DigitalProduct();
                digitalProduct.setProductType(productType);
                return digitalProduct;
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}
