package Task3_1;

public class SpecialProduct extends Product {
    int regularPrice;
    int percentageOff;
    SpecialProduct(int price, String name) {
        super(price, name);
    }

    @Override
    public String toString() {
        return String.format("Name : %s , Rs: %d, regularPrice: %d and percentageOff: %d",this.name,this.price,this.regularPrice,this.percentageOff);
    }
    public static SpecialProduct applyOffOnProduct(Product product ,int percentageOff){
        int discountedPrice=(product.price-(product.price*percentageOff/100));
        SpecialProduct specialProduct=new SpecialProduct(discountedPrice,product.name);
        specialProduct.regularPrice=product.price;
        specialProduct.percentageOff=percentageOff;
        return specialProduct;
    }
}
