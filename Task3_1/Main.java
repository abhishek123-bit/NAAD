package Task3_1;

public class Main {
    public static void main(String[] args) {
        Product p1=new Product(12,"BlackPen");
        Product p2=new Product(12,"BlackPen");
        Product p3=new Product(20,"BallPen");
        System.out.println(p1.equals(p2));

       SpecialProduct specialProduct= SpecialProduct.applyOffOnProduct(p1,10);
        System.out.println(specialProduct);
    }
}
