import java.util.Scanner;
public class Account
{

    /**  String that represents the Person object's username  
    */ 
    private String username;

    
    /**  String that represents the Person object's password  
    */
    
    private String password;
    
    /** Person associated with the account
    */ 
    private Person person;
    
    private String petName;
    
    
     
    /**
    Constructs an Account with all unknown attributes
    */
    
    public Account() {
        person = new Person();
        username = "No username provided";
        password = "No password provided";
        petName = "No pet name provided";  
    }
    
     /**
    Constructs an Account with a person class, username, and password
    */
    
    public Account(Person tempPerson, String tempUser, String tempPassword, String tempPetName){
    
        person = tempPerson;   
        username = tempUser;
        password = tempPassword;
        petName = tempPetName;  
        
    }
    
     /**
    Accessor method that is used to return the Account object's username   
     */
    
    public String getUser() {
       return username;
    }
    
    /**
    Accessor method that is used to return the Account object's password   
     */
    
    public String getPassword() {
       return password;
    }
    
    
    public String getPetName() {
    return petName;
    
    }
    /**
    Mutator method that is used to change the Account object's username to a set value
    */
    
    public void setUser (String newUser) {
    username = newUser;
    }
    
    
    /**
    Mutator method that is used to change the Account object's password to a set value
    */
    
    public void setPassword (String newPassword) {
    password = newPassword;
    }


    public void setPetName (String newPetName) {
    petName = newPetName;
    
    }
    
     public String toString() {
    
      if (username == "No username provided" || password == "No password provided" || petName == "No pet name provided") {
      
         return (String) "Incomplete profile\n"; 
      
      }
    
      return  ("\n" + "Username: " +  username + ", password: " + password + ", pet name: " + petName);
      
      }

    
    
   
    public void setPassword2()
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter a password:");
      String newPassword = scan.nextLine();
      if (newPassword.equalsIgnoreCase("cancel"))
      {
         System.out.println("Canceled.");
      }
      else 
      {
      PasswordChecker(newPassword); 
      }
    }
    
    public void PasswordChecker(String newPassword)
    {
     int count = 0;
     int upperCount = 0;
     int lowerCount = 0;
     int integerCount = 0;
     
     if (newPassword.equalsIgnoreCase("cancel"))
         {
            System.out.println("Canceled.");
         }
         
         else
         {
     
     // characters
     if (newPassword.length() < 7)
      {
         count++;
         System.out.println("Error: password must contain 8 or more characters.");
      }
      
      // uppercase
      for (int i = 0; i < newPassword.length(); i++)
      {
         if (Character.isUpperCase(newPassword.charAt(i)))
         {
         upperCount++;
         }
      }
      
      if (upperCount < 1)
      {
         count++;
         System.out.println("Error: password must contain at least 1 uppercase letter");
      }
      
      // lowercase
      for (int i = 0; i < newPassword.length(); i++)
      {
         if (Character.isLowerCase(newPassword.charAt(i)))
         {
         lowerCount++;
         }
      }
      
      if (lowerCount < 1)
      {
         count++;
         System.out.println("Error: password must contain at least 1 lowercase letter");
      }
      
      
      // digits
      for (int i = 0; i < newPassword.length(); i++)
      {
         if (Character.isDigit(newPassword.charAt(i)))
         {
            integerCount++;
         }
      }
      
      if (integerCount == 0)
      {
         count++;
         System.out.println("Error: password must contain at least 1 digit '0-9'");
      }
      
      
      // rerun
      if (count > 0)
      {
         
         Scanner scanAgain = new Scanner (System.in);
         System.out.println("Please enter a new password:");
         newPassword = scanAgain.nextLine();
         PasswordChecker(newPassword);
         
      }
      else if (count == 0)
      {
      System.out.println("Your password has been accepted. Your password is: " + newPassword);
      password = newPassword;
      }
      
      }

    }
    
    
 
   public void setPassword3()  
   {
      Scanner scan2 = new Scanner(System.in);
      System.out.println("Please enter a password or type cancel");
      String newPassword2 = scan2.nextLine();
      if (newPassword2.equals("cancel"))
      {
         System.out.println("Your password has not been changed; your request is canceled.");
      }
      else
      {
      Checker2(newPassword2);
      }
      
   } 
   
   
   public void Checker2(String newPassword2)
   {
      int count2 = 0;
      
      if (newPassword2.equalsIgnoreCase("cancel"))
         {
            System.out.println("Canceled.");
         }
         
         else
         {

      // length
      if ((newPassword2.length() < 8) || (newPassword2.length() > 16))
      {
      count2++;
      System.out.println("Error: password must contain 8 or more characters but cannot exceed 16 characters.");
      }
      
       
      for (int i = 0; i < (newPassword2.length()-petName.length()+1); i++)
      {
         System.out.print("x");
         if ((newPassword2.substring(i, i+petName.length())).equals(petName))
         {
         count2++;
         System.out.println("Error: password cannot contain pet name.");
         }
      }
      
      
      
      
       // repeated letters
      for (int i = 1; i < newPassword2.length(); i++)
      {
         String letter1 = newPassword2.substring(i-1, i);
         String letter2 = newPassword2.substring(i, i+1);
         if (letter1.equals(letter2))
         {
         count2++;
         System.out.println("Error: password cannot contain repeated letters.");
         }
      } 

      
     
           
      // rerun
      if (count2 > 0)
      {
         
         Scanner scanAgain2 = new Scanner (System.in);
         System.out.println("Please enter a new password:");
         newPassword2 = scanAgain2.nextLine();
         Checker2(newPassword2);
         
      }
      else if (count2 == 0)
      {
      System.out.println("Your password has been accepted. Your password is: " + newPassword2);
      password = newPassword2;
      }
    
     }
         
   }

         
      
      
 }


