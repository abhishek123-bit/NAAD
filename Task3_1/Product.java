package Task3_1;

import java.util.Objects;

public class Product {
    String name;
    int price;

    public Product() {
    }

    public Product(int price, String name) {
        this.price = price;
        this.name=name;
    }

    @Override
    public String toString() {
        return String.format("Name %s and Rs. %d",name,price);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(obj==this){
            return  true;
        }
        if(getClass()!=obj.getClass()){
            return  false;
        }
        Product p=(Product)obj;
        return this.price==p.price&&this.name.equals(p.name);
    }

}
