import java.util.*;

/** This class creates MenuItem objects that will be added to my restaurant Menu
*/
public class MenuItem
{

/** private instance String that represents a menu item's name 
*/
private String name;
/** private instance String that represents a menu item's description. Explains what the menu item is 
*/
private String description;
/** private instance double that represents a menu item's price. 
*/
public double price;
/** private instance char that represents a menu item's size 
*/
private char size;
/** private instance int that represents a menu item's id, used to add items to an Order 
*/
public int id;


   /** Constructs a MenuItem object with no description or size
   @param tempName name of MenuItem object
   @param tempPrice price of MenuItem object
   @param tempId id of MenuItem object
   */
   public MenuItem(String tempName, double tempPrice, int tempId)
   {
      name = tempName;
      price = tempPrice;
      id = tempId;
   }

   /** Constructs a MenuItem object with no description but with a size
   @param tempName name of MenuItem object
   @param tempPrice price of MenuItem object
   @param tempId id of MenuItem object
   @param tempSize size of MenuItem object
   */
   public MenuItem(String tempName, double tempPrice, char tempSize, int tempId)
   {
      name = tempName;
      price = tempPrice;
      size = tempSize;
      id = tempId;
   }
   
   /** Constructs a MenuItem object with all known attributes   
   @param tempName name of MenuItem object
   @param tempPrice price of MenuItem object
   @param tempId id of MenuItem object
   @param tempSize size of MenuItem object
   @param tempDesc description of MenuItem object
   */
   public MenuItem(String tempName, double tempPrice, char tempSize, String tempDesc, int tempId)
   {
      name = tempName;
      price = tempPrice;
      size = tempSize;
      description = tempDesc;
      id = tempId;
   }
  
  /** Constructs a MenuItem object with no size but with a description   
   @param tempName name of MenuItem object
   @param tempPrice price of MenuItem object
   @param tempId id of MenuItem object
   @param tempDesc description of MenuItem object
   */
  public MenuItem(String tempName, double tempPrice, String tempDesc, int tempId)
   {
      name = tempName;
      price = tempPrice;
      size = '-';
      description = tempDesc;
      id = tempId;
   }
   
   /** getter method that returns a name value
   */
   public String getName() 
   {
      return name;
   }
   
   /** getter method that returns a description value
   */
   public String getDesc() 
   {
      return description;
   }
   
   /** getter method that returns a price value
   */
   public double getPrice() 
   {
      return price;
   }
   
   /** getter method that returns a size value
   */
   public char getSize() 
   {
      return size;
   }
   
   /** getter method that returns a id value
   */
    public int getId() 
   {
      return id;
   }
 
   
   /** returns a formatted MenuItem object in String form
   */
   public String toString()
   {
      if (description != null)
      {
         return "Item " + id + ": " + name + ", $" + price + "\n(" + description + ")\n";
      }
      else
      {
         return "Item " + id + ": " + name + ", $" + price + "\n";
      }
   }
   

}