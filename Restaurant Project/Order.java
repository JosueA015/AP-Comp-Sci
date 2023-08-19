import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;

/** this class allows our Restaurant to take individual orders
*/
public class Order
{

   /** private instance ArrayList of MenuItems that stores all of the MenuItems someone orders
   */
   private ArrayList<MenuItem> orderList;
   
   /** Constructs an Order object with a new ArrayList of MenuItems
   */
   public Order()
   {
      orderList = new ArrayList<MenuItem>();
   }

   /** getter method that returns the ArrayList of the Order object
   */
   public ArrayList<MenuItem> getOrder()
   {
      return orderList;
   }
   
   /** method that adds a MenuItem to the Order object
   @param addedItem the added MenuItem
   */
   public void addItem(MenuItem addedItem)
   {
      orderList.add(addedItem);
   }
   
   /** mathod that removes a MenuItem from the Order object
   @param removedItem the removed MenuItem
   */
   public void removeItem(MenuItem removedItem)
   {
      orderList.remove(removedItem);
   }
   
   
      
}