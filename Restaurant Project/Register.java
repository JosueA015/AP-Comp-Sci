import java.text.DecimalFormat;
import java.util.*;

/** this class handles all of the price calculation for the restaurant class, and generates the check
*/
public class Register
{

/** the default subtotal
*/
static double subTotal = 0; 

/** the tax rate for Fulton County, GA
*/
static final double taxRate = 0.0775; 

/** formatting that rounds to two decimal places
*/
static DecimalFormat totalD = new DecimalFormat("0.00");
  
  
  /** method that calculates the subtotal of an Order
  @param order the Order that the method calculates the subtotal for
  @return the subtotal
  */
  public static double calculateSubTotal(Order order)
  {
     double subTotal = 0.00;
     for (int i = 0; i < order.getOrder().size(); i++)
     {
        subTotal += order.getOrder().get(i).price;
     }   
     
     return (subTotal*100.0)/100.0;
  }
  
  
  /** method that calculates the tax of the order
  @param subTotal the subtotal of the order
  @return the tax amount
  */
  public static String calculateTax(double subTotal)
  {
     return totalD.format(subTotal * taxRate);
  }
  
  
  /** method that asks for a tip, and gives tip suggestions
  @param subTotal the subtotal of the order
  @return the user's requested tip amount
  */
  public static double generateTip(double subTotal)
  {
     Scanner scan = new Scanner(System.in);
     System.out.println("Would you like to tip? Common tips: 20% = " + (totalD.format(subTotal * .2)) + ", 25% = " + (totalD.format(subTotal * .25)) + ". If not, type 0.");
     return scan.nextDouble();
  }
  
  /** method that generates the total cost of the order
  @param SubTotal the subtotal of the order
  @param tipAmount the tip that the user entered
  @return the total cost as a string
  */
  public static String generateTotal(double SubTotal, double tipAmount)
  {
     return totalD.format(SubTotal + (SubTotal * taxRate) + tipAmount);
  } 
  
  /** method that generates a formatted check with the items ordered, subtotal, tip amount, tax amount, and total
  @param order the order that goes with the check
  @return the formatted check
  */
  public static String produceCheck(Order order)
  {
     String check = "";
     subTotal = calculateSubTotal(order);
     double tipAmount = generateTip(subTotal);
     for (int i = 0; i < order.getOrder().size(); i++)
        {
           check = check + "\n" + order.getOrder().get(i).getName() +", " + order.getOrder().get(i).getPrice() + "\n";
        }
        
     
     check = check + "\nSubtotal: " + subTotal + "\n";
     check = check + "Tax: " + calculateTax(subTotal) + "\n";
     check = check + "Tip: " + tipAmount + "\n";
     check = check + "Total: " + generateTotal(subTotal, tipAmount) + "\n";
     
     return check;
     
     
  }


}