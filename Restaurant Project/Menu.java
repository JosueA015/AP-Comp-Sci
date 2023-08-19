import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;

/** this class builds the Menu for my Restaurant, as well as creates the order process
*/
public class Menu
{
   /** private instance ArrayList that stores the appetizers
   */
   private static ArrayList<MenuItem> appetizers = new ArrayList<MenuItem>();
   /** private instance ArrayList that stores the beverages
   */
   private static ArrayList<MenuItem> beverages = new ArrayList<MenuItem>();
   /** private instance ArrayList that stores the soups and salads
   */
   private static ArrayList<MenuItem> soupsAndSalads = new ArrayList<MenuItem>();
   /** private instance ArrayList that stores the entrees
   */
   private static ArrayList<MenuItem> entrees = new ArrayList<MenuItem>();
   /** private instance ArrayList that stores the sandwiches
   */
   private static ArrayList<MenuItem> sandwiches = new ArrayList<MenuItem>();
   /** private instance ArrayList that stores the sides
   */
   private static ArrayList<MenuItem> sides = new ArrayList<MenuItem>();
   
   
   /** constructor that calls the build methods to create a Menu object
   */
   public Menu()
   {
      buildAppetizers();
      buildBeverages();
      buildSoupsAndSalads();
      buildEntrees();
      buildSandwiches();
      buildSides();
   }
   
   /** method that fills the appetizers ArrayList with the correct appetizer items
   */ 
   private static void buildAppetizers()
   {
     appetizers.add(new MenuItem("mariquitas", 4.59, "Crispy chips, Cuban style. Thinly sliced plantains, lightly fried and served with a side of garlic mojo oil", 1));
     appetizers.add(new MenuItem("maduros", 3.29, "plantains that are deep-fried to a golden brown", 2));
     appetizers.add(new MenuItem("chicken wings", 9.99, 3));
     appetizers.add(new MenuItem("appetizer tacos", 9.99, "3 delicious white corn tortillas are filled with chicken", 4));
     appetizers.add(new MenuItem("mofongo", 4.99, "A popular Puerto Rican dish that combines pork and fried green plantains with onions, garlic, and spices", 5));   
   }
       
   /** method that fills the beverages ArrayList with the correct beverage items
   */ 
   private static void buildBeverages()
   {
     beverages.add(new MenuItem("water", 0.00, 6));
     beverages.add(new MenuItem("lemonade", 2.29, 7));
     beverages.add(new MenuItem("cafe con leche", 3.49, "Similar to a Cafe Latte, this Cuban coffee is made with frothed milk and sugar", 8));
     beverages.add(new MenuItem("smoothie", 4.29, 9));
     beverages.add(new MenuItem("cuban coffee", 1.59, "Traditional Cuban Espresso is twice as strong as American coffee.", 10));
     beverages.add(new MenuItem("tea", 2.29, 11));
     beverages.add(new MenuItem("can soda", 1.89, 12));
   }
   
   /** method that fills the soupsAndSalads ArrayList with the correct soup and salad items
   */ 
   private static void buildSoupsAndSalads()
   {
     soupsAndSalads.add(new MenuItem("ajiaco", 7.99, "This slow-cooked Cuban stew gets its hearty flavor from a combination of chicken, pork, yuca, malanga, corn, and potatoes", 13));
     soupsAndSalads.add(new MenuItem("Chicken soup", 4.99, 14));
     soupsAndSalads.add(new MenuItem("black bean soup", 3.99, 15));
     soupsAndSalads.add(new MenuItem("papi's chicken salad", 7.99, "Our freshly tossed lettuce salad is topped with tomato slices, onions, mozzarella cheese, and croutons. Served with Papi's Mango Pineapple Vinaigrette.", 16));
   }
   
  /** method that fills the sandwiches ArrayList with the correct sandwich items
   */ 
   private static void buildSandwiches()
   {
     sandwiches.add(new MenuItem("papi's cuban sandwich", 9.29, "Our signature Rey's Cuban Sandwich stacked with lettuce, onions, tomatoes and Papi's Special Sauce", 17));
     sandwiches.add(new MenuItem("pollo cuban sandwich", 9.29, "served with Swiss Cheese, dill pickles, mustard, lettuce, onions, tomatoes, and Papi's Special Sauce", 18));
     sandwiches.add(new MenuItem("ropa vieja sandwich", 9.29, "Shredded beef and Swiss cheese, piled high and served on Cuban bread with Papi's Special Sauce", 19));
     sandwiches.add(new MenuItem("vegetarian sandwich", 9.29, "Grilled vegetables, topped with Papi's Special Sauce, a citrusy mojo sauce, Swiss cheese, and served with mustard", 20));
     sandwiches.add(new MenuItem("fish sandwich ", 9.29, "A light grilled or crispy fried Tilapia fillet, with Swiss cheese, mustard, Papi's Special Sauce, and lettuce", 21));
     sandwiches.add(new MenuItem("pan con bistec", 9.29, "Palomilla Steak served on Cuban bread with potato sticks, Swiss cheese and Papi's Special Sauce", 22));
   }
   
   /** method that fills the sides ArrayList with the correct side items
   */ 
   private static void buildSides()
   {
      sides.add(new MenuItem("french fries", 2.49, 23));
      sides.add(new MenuItem("yellow rice", 2.49, 24));
      sides.add(new MenuItem("white rice", 2.49, 25));
      sides.add(new MenuItem("black beans", 2.49, 26));
      sides.add(new MenuItem("congris", 3.29, "Seasoned white rice and black beans, cooked with bacon", 27));
      sides.add(new MenuItem("yuca fries", 3.29, "Fried yuca served with Papi's Special Sauce", 28));
      sides.add(new MenuItem("veggies", 3.29, "Green beans, broccoli, yellow carrots, and red peppers grilled in mojo and Papi's Garlic Sauce", 29));
   }
   
   /** method that fills the entrees ArrayList with the correct entree items
   */ 
   private static void buildEntrees()
   {
     entrees.add(new MenuItem("Arroz con Pollo", 12.99, "A quarter of chicken, marinated in exotic spices and slowly simmered. Served with seasoned yellow rice with peas, plantains, and salad", 30));
     entrees.add(new MenuItem("Pollo a la Milanesa", 13.99, "Breaded chicken breast topped with naturally seasoned tomato sauce, mozzarella and Swiss cheese, served with seasoned yellow rice, plantains, and salad", 31));
     entrees.add(new MenuItem("Masitas de Puerco", 12.99, "A classic Cuban dish. Tender cubed pork, marinated with Cuban spices and Mojo sauce, lightly pan-fried and topped with sautéed onions. Served with Congris, Tostones, and Salad", 32));
     entrees.add(new MenuItem("Mofongo con Camarones", 14.99, "Delicious shrimp is sautéed with tomato puree, onions, garlic, and red and green peppers. Served with Mofongo and our homemade plantain chips", 33));
     entrees.add(new MenuItem("Ropa Vieja", 11.99, "Tried and true recipe. This shredded beef dish has a Creole tomato sauce and Cuban seasoning with peppers and onions", 34));
     entrees.add(new MenuItem("Pollo Vaca Frita", 13.99, "Chicken breast is grilled to perfection with Spanish seasoning, then shredded and simmered with onions and colorful peppers", 35));
     entrees.add(new MenuItem("Jerk Chicken Breast", 10.99, "Tender, cubed chicken slow-cooked in a spicy sweet Jamaican jerk sauce", 36));
     entrees.add(new MenuItem("Tilapia Fillet", 10.99, "This light tasting white fish has a mild flavor that is excellent grilled or fried", 37));
     entrees.add(new MenuItem("Churrasco Steak", 19.99 , "A Latin American classic! A tender, 10 oz. USDA Choice churrasco steak is served with a lively chimichurri sauce", 38));
     entrees.add(new MenuItem("Lechon Asado", 10.99 , "You can't rush perfection. This pork dish is marinated 24 hours in Papi's signature seasoning, slow roasted overnight, and pulled", 39));
     entrees.add(new MenuItem("Grilled Vegetable Plate", 10.99 , "Green beans, broccoli, yellow carrots, and red peppers grilled in mojo and garlic oil", 40)); 
   }
   
   
   /** getter method that returns the appetizers ArrayList
   @return the appetizer ArrayList
   */
   public static ArrayList getAppetizers()
   {
      return appetizers;
   }
   
    /** getter method that returns the beverages ArrayList
    @return the beverages ArrayList
   */
   public static ArrayList getBeverages()
   {
      return beverages;
   }
   
    /** getter method that returns the soupsAndSalads ArrayList
    @return the soups and salads ArrayList
   */
   public static ArrayList getSoupsAndSalads()
   {
      return soupsAndSalads;
   }
   
    /** getter method that returns the sandwiches ArrayList
    @return the sandwiches ArrayList
   */
   public static ArrayList getSandwiches()
   {
      return sandwiches;
   }
   
    /** getter method that returns the sides ArrayList
    @return the sides ArrayList
   */
   public static ArrayList getSides()
   {
      return sides;
   }
   
    /** getter method that returns the entrees ArrayList
    @return the entrees ArrayList
   */
   public static ArrayList getEntrees()
   {
      return entrees;
   }
   
    /** method that returns the full Menu
    @return the fullMenu ArrayList
   */
   public static ArrayList getFullMenu()
   {
      ArrayList<ArrayList> fullMenu = new ArrayList<ArrayList>();
      fullMenu.add(appetizers);
      fullMenu.add(beverages);
      fullMenu.add(soupsAndSalads);
      fullMenu.add(sandwiches);
      fullMenu.add(sides);
      fullMenu.add(entrees);
      
      return fullMenu; 
   }
   
    /**  method that returns the full Menu as a formatted String
    @return the full formatted Menu ArrayList
   */
   public static String fullMenuString()
   {
      String str = "";
      ArrayList<ArrayList> fullMenu2 = getFullMenu();
      for (int i = 0; i < fullMenu2.size(); i++)
      {
         str = str + "----------------------------------------------------------------------\n\n";
         for (int k = 0; k < fullMenu2.get(i).size(); k++)
         {
            str = str + fullMenu2.get(i).get(k) + "\n";
         }
      }
      
      return str;

   }
   
    /** method that contains the process of ordering, including adding and removing items, tipping, and calculating the total cost   
     */
   public static void orderProcess()
   {
      //starting the order
      Order newOrder = new Order();
      double finalPrice = 0.00;
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to Papi's! Here is our menu: \n");
      System.out.println(fullMenuString());
      
      //asking for appetizer
      System.out.println("Would you like an appetizer? If so, type in the item number of the item of your choice.\nOnce you are finished ordering appetizers, type zero (0).\nIf you want to remove an item, type the negative version of the id number (ex -6: remove water).");
      boolean success = false;
      int firstQ = -1;
      while (!success)
      {
      try {
         firstQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
      }
         
      while (firstQ != 0)
      {
         if (firstQ > 0)
         {
            for (int i = 0; i < appetizers.size(); i++)
            {
               if (appetizers.get(i).id == firstQ)
               {
                  newOrder.addItem(appetizers.get(i));
                  finalPrice += appetizers.get(i).price;
               } 
            }
         }
         else if (firstQ < 0)
         {
            for (int i = 0; i < appetizers.size(); i++)
            {
               if (appetizers.get(i).id == Math.abs(firstQ))
               {
                  newOrder.removeItem(appetizers.get(i));
                  finalPrice -= appetizers.get(i).price;
               } 
            }

         }   
         
         success = false;
         while (!success)
      {
      try {
         firstQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
      }
      }
      
      
      //asking for beverage
      System.out.println("Would you like a beverage? If so, type in the item number of the item of your choice.\nOnce you are finished ordering beverages, type zero (0).\nIf you want to remove an item, type the negative version of the id number (ex -6: remove water).");
      success = false;
      int secondQ = -1;
      while (!success)
      {
      try {
         secondQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
      }
 
      
       while (secondQ != 0)
      {
         if (secondQ > 0)
         {
            for (int i = 0; i < appetizers.size(); i++)
            {
               if (beverages.get(i).id == secondQ)
               {
                  newOrder.addItem(beverages.get(i));
                  finalPrice += beverages.get(i).price;
               } 
            }
         }
         else if (secondQ < 0)
         {
            for (int i = 0; i < beverages.size(); i++)
            {
               if (beverages.get(i).id == Math.abs(secondQ))
               {
                  newOrder.removeItem(beverages.get(i));
                  finalPrice -= beverages.get(i).price;
               } 
            }

         }   
         
         success = false;
         while (!success)
      {
      try {
         secondQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
      }
      }
      

       
      //asking for soup or salad
     System.out.println("Would you like a soup or salad? If so, type in the item number of the item of your choice.\nOnce you are finished ordering soups and salads, type zero (0).\nIf you want to remove an item, type the negative version of the id number (ex -6: remove water).");
     success = false;
      int thirdQ = -1;
      while (!success)
      {
      try {
         thirdQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
         }

     while (thirdQ != 0)
      {
         if (thirdQ > 0)
         {
            for (int i = 0; i < soupsAndSalads.size(); i++)
            {
               if (soupsAndSalads.get(i).id == thirdQ)
               {
                  newOrder.addItem(soupsAndSalads.get(i));
                  finalPrice += soupsAndSalads.get(i).price;
               } 
            }
         }
         else if (thirdQ < 0)
         {
            for (int i = 0; i < soupsAndSalads.size(); i++)
            {
               if (soupsAndSalads.get(i).id == Math.abs(thirdQ))
               {
                  newOrder.removeItem(soupsAndSalads.get(i));
                  finalPrice -= soupsAndSalads.get(i).price;
               } 
            }

         }   
         
        success = false;
         while (!success)
      {
      try {
         thirdQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
      }
      }
      
          
       
      //asking for sandwich
      System.out.println("Would you like a sandwich? If so, type in the item number of the item of your choice.\nOnce you are finished ordering sandwiches, type zero (0).\nIf you want to remove an item, type the negative version of the id number (ex -6: remove water).");
      success = false;
      int fourthQ = -1;
      while (!success)
      {
      try {
         fourthQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
         }
      while (fourthQ != 0)
      {
         if (fourthQ > 0)
         {
            for (int i = 0; i < sandwiches.size(); i++)
            {
               if (sandwiches.get(i).id == fourthQ)
               {
                  newOrder.addItem(sandwiches.get(i));
                  finalPrice += sandwiches.get(i).price;
               } 
            }
         }
         else if (fourthQ < 0)
         {
            for (int i = 0; i < sandwiches.size(); i++)
            {
               if (sandwiches.get(i).id == Math.abs(fourthQ))
               {
                  newOrder.removeItem(sandwiches.get(i));
                  finalPrice -= sandwiches.get(i).price;
               } 
            }

         }   
         
         success = false;
         while (!success)
      {
      try {
         fourthQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
      }

      }
      
            
      //asking for sides
      System.out.println("Would you like a side? If so, type in the item number of the item of your choice.\nOnce you are finished ordering sides, type zero (0).\nIf you want to remove an item, type the negative version of the id number (ex -6: remove water).");
      
      success = false;
      int fifthQ = -1;
      while (!success)
      {
      try {
         fifthQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
         }
      while (fifthQ != 0)
      {
         if (fifthQ > 0)
         {
            for (int i = 0; i < sides.size(); i++)
            {
               if (sides.get(i).id == fifthQ)
               {
                  newOrder.addItem(sides.get(i));
                  finalPrice += sides.get(i).price;
               } 
            }
         }
         else if (fifthQ < 0)
         {
            for (int i = 0; i < sides.size(); i++)
            {
               if (sides.get(i).id == Math.abs(fifthQ))
               {
                  newOrder.removeItem(sides.get(i));
                  finalPrice -= sides.get(i).price;
               } 
            }

         }   
         
         success = false;
         while (!success)
      {
      try {
         fifthQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
      }

      }
      
      
      //asking for entree
      System.out.println("Would you like an entree? If so, type in the item number of the item of your choice.\nOnce you are finished ordering entrees, type zero (0).\nIf you want to remove an item, type the negative version of the id number (ex -6: remove water).");
      
      success = false;
      int sixthQ = -1;
      while (!success)
      {
      try {
         sixthQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
         }

      while (sixthQ != 0)
      {
         if (sixthQ > 0)
         {
            for (int i = 0; i < entrees.size(); i++)
            {
               if (entrees.get(i).id == sixthQ)
               {
                  newOrder.addItem(entrees.get(i));
                  finalPrice += entrees.get(i).price;
               } 
            }
         }
         else if (sixthQ < 0)
         {
            for (int i = 0; i < entrees.size(); i++)
            {
               if (entrees.get(i).id == Math.abs(sixthQ))
               {
                  newOrder.removeItem(entrees.get(i));
                  finalPrice -= entrees.get(i).price;
               } 
            }

         }   
         
         success = false;
         while (!success)
      {
      try {
         sixthQ = scan.nextInt();
         success = true;
         } catch (InputMismatchException i) {
         System.out.println("Please enter a valid integer.");
         scan.next();
         }
      }

      }
      
      

             
      //ending order
      Register finalProduct = new Register();
      System.out.println("\n\nThank you for shopping at Papi's! \n" + finalProduct.produceCheck(newOrder));
      
      
      
   }
   
   
  


}