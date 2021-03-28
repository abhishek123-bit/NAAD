package Task3_2;

public class GroceryCartItem extends GroceryItem {
    float price;
    float quantity;
    public GroceryCartItem(String name,int PricePerKg){
        super(name,PricePerKg);
    }
    @Override
    public String toString(){
        return String.format("%s (₹%d X %.2f) = ₹%.2f",name,PricePerKg,quantity,price);
    }
    public static float ExtractQuantity(String quantityStr){
        String s=quantityStr.replace("kg ",".").replace("kg",".").replace("g","");
              if(!s.contains(".")){
                  return Float.parseFloat(s)/1000;
              }
              else{
                  float k=Float.parseFloat(s.substring(0,s.indexOf(".")));
                  String sg=s.substring(s.indexOf(".")+1);
                  float g=0;
                  if(sg.length()!=0){
                   g=Float.parseFloat(sg);
                  }
                  return k+g/1000 ;
               }


    }
    public static GroceryCartItem createNew(GroceryItem item, String quantityStr){
        GroceryCartItem CartItem=new GroceryCartItem(item.name,item.PricePerKg);
        CartItem.quantity=ExtractQuantity(quantityStr);
        CartItem.price=CartItem.PricePerKg*CartItem.quantity;
        return CartItem;
    }

}
