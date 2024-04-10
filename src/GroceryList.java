import java.util.ArrayList;
import java.util.Optional;

public class GroceryList {
    public ArrayList<GroceryItemOrder> list;

    public GroceryList() {
        list = new ArrayList<GroceryItemOrder>();
    }

    public void add(GroceryItemOrder item) {
        if (list.size() < 10) {
            boolean onthelist = list.stream().anyMatch(result -> result.name.equals(item.name));
            if (!onthelist) {
                list.add(item);
            } else {
                GroceryItemOrder match = list.stream().filter(result -> result.name.equals(item.name)).findFirst().get();
                //int index=list.indexOf(match);
                if(match.pricePerUnit==item.pricePerUnit){
                    System.out.println("new item "+ item.name +" already exists, increasing quantity on list");
                    match.quantity += item.quantity;
                }
                else {
                    System.out.println("new item "+ item.name +" has a different price per unit, adding new item to list");
                    list.add(item);
                }
            }
        }
        else{System.out.println("grocery list can have no more than 10 items");}
    }
    public double getTotalCost(){
        double total = 0;
        for(GroceryItemOrder i: list){
            total+=i.quantity*i.pricePerUnit;
        }
        return total;
    }
}
