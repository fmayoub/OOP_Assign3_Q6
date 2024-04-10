import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        GroceryList groceries = new GroceryList();
        GroceryItemOrder summer_watermelon = new GroceryItemOrder("watermelon", 7.00);
        GroceryItemOrder apples = new GroceryItemOrder("apple", 2.50);
        GroceryItemOrder oranges = new GroceryItemOrder("orange", 4);

        for (GroceryItemOrder i: groceries.list){
            System.out.println(i.quantity+" units of "+i.name+" cost $"+i.pricePerUnit+" per unit, and $"+i.getCost()+" total.");
        }
        groceries.add(summer_watermelon);
        groceries.add(apples);
        groceries.add(oranges);

        summer_watermelon.setQuantity(1);
        apples.setQuantity(5);
        oranges.setQuantity(3);

        for (GroceryItemOrder i: groceries.list){
            System.out.println(i.quantity+" units of "+i.name+" cost $"+i.pricePerUnit+" per unit, and $"+i.getCost()+" total.");
        }
        System.out.println("total cost: $" + groceries.getTotalCost());

        GroceryItemOrder more_apples =  new GroceryItemOrder("apple",3);//different price per unit
        GroceryItemOrder more_oranges = new GroceryItemOrder("orange",4);

        more_oranges.setQuantity(2);
        groceries.add(more_oranges);

        more_apples.setQuantity(2);
        groceries.add(more_apples);

        summer_watermelon.setQuantity(3);

        for (GroceryItemOrder i: groceries.list){
            System.out.println(i.quantity+" units of "+i.name+" cost $"+i.pricePerUnit+" per unit, and $"+i.getCost()+" total.");
        }
        System.out.println("total cost: $" + groceries.getTotalCost());

    }
}
