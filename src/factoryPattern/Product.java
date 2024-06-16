package factoryPattern;

public class Product {
    String name;
    float value;
    EnumProductType productType;

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }

    public EnumProductType getProductType() {
        return productType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setProductType(EnumProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", productType=" + productType +
                '}';
    }
}
