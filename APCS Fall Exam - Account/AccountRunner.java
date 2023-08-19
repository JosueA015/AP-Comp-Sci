import java.util.*;
public class AccountRunner 
{
   public static void main (String[] args) 
   {
   
      ArrayList<Account> acctList = new ArrayList<Account>();
   
      Person person1 = new Person("l", "m", 25, 160.0, "xxx");
      Person person2 = new Person("Roger", "Federer", 26, 180.0, "xxx");
      Person person3 = new Person("Rafael", "Nadal", 27, 185.0, "rafael.nadal@gmail.com");
   
      Account account1 = new Account(person2, "rogerfederer", "20slams", "rover");
      
      acctList.add(account1);
      acctList.add(new Account(person3, "nadalgoat", "kingofthecourt", "rufus"));
         
     
       account1.setPassword2();
       System.out.println(account1);
   
   }
}



