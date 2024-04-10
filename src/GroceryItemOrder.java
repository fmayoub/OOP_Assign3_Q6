public class GroceryItemOrder {
     String name;
     int quantity;
     double pricePerUnit;
     public GroceryItemOrder(String name,  double pricePerUnit){
          this.name=name;
          this.pricePerUnit=pricePerUnit;
     }
     public void setQuantity(int quantity){
          if(this.quantity!=0){
               if(quantity<this.quantity){
                    System.out.println("decreasing quantity of " +this.name + " from "+this.quantity+" to " +quantity);
               } else if (quantity>this.quantity) {
                    System.out.println("increasing quantity of " +this.name+ " from "+this.quantity+" to " +quantity);
               }
          }
          else{System.out.println("adding " +quantity+" units of " +this.name+" to list");}
          this.quantity=quantity;
     }
     public double getCost(){return pricePerUnit*quantity;}


}
