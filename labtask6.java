import java.util.Scanner;
public class labtask6 {

  public static void main(String args[])
  {
  
    Scanner in = new Scanner(System.in );
    int choice;
    System.out.println("Please enter a choice");
    System.out.println("Menu");
    System.out.println("1.Burger-100/-");
    System.out.println("2.Pizza-200/-");
    System.out.println("3.Pasta-350/-");
    System.out.println("4.Exit");
    choice = in.nextInt();
    switch(choice)
    {
      case 1:
      System.out.println("Burger is chosen");
      System.out.println("Burger's price is 100/-");
      break;
      case 2:
      System.out.println("Pizza is chosen");
      System.out.println("Pizza's price is 200/-");
      break;
      case 3:
      System.out.println("Pasta is chosen");
      System.out.println("Pasta's price is 300/-");
      break;
      default:       
       System.out.println("Invalid item");         
        }
    }
}



																																																																																																																																																																																																																																																																		
      
																																																																																																																																																																																																																																																															
																																																																																																																																																																																																																																																																					  