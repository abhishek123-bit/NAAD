package Task3_2;

public class Main {
    public static void main(String[] args) {
        GroceryItem Item1=new GroceryItem("Sugar",35);
        GroceryItem Item2=new GroceryItem("Apple",100);
        GroceryItem Item3=new GroceryItem("Jaggery",25);
        GroceryItem Item4=new GroceryItem("Mango",135);
        Cart cart=new Cart();
        cart.add(GroceryCartItem.createNew(Item1,"3kg"))
                .add(GroceryCartItem.createNew(Item2,"1kg 0g"))
                .add(GroceryCartItem.createNew(Item3,"5g"))
                .add(GroceryCartItem.createNew(Item4,"1kg 5g"));
        System.out.println(cart);
    }
}
