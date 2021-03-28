package Task3_2;

import java.util.ArrayList;

public class Cart {
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;
    StringBuilder str=new StringBuilder();
    public Cart(){
        this.cartItems=new ArrayList<>();
        this.totalAmount=0;
    }
    Cart add(GroceryCartItem item){
        str.append("\t\t"+item.toString()+",\n");
       cartItems.add(item);
       totalAmount+=item.price;
       return this;
    }
    @Override
    public String toString(){



           return     "Cart{\n" +
                    "\t"+"groceryCartItems =[\n"+ str+
               "\t],\n"+"\ttotalAmount="+totalAmount;


    }
}
