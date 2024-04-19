import java.util.Scanner;
public class Menudriven
{
 public static void main(String[] args)
 {
  int choice,choice2,total=0;
  char ans;
  String order="";
  Scanner sc=new Scanner(System.in);
  System.out.println("**********Welcome to Hotel SPITFIRE*********");
  do
  {
    System.out.println("Menu.");
    System.out.println("1.Starters");
    System.out.println("2.Main Course");
    System.out.println("3. Deserts");
    System.out.println("4.SoftDrinks");
    choice=sc.nextInt();
    switch(choice)
    {
    case 1:
      System.out.println("1. Soup \t\t\t\t\t RS.120");
      System.out.println("2. Salad\t\t\t\t\t RS.140");
      System.out.println("3.Spring rolls \t\t\t\t\t RS.160");
      System.out.println("4.chilli paneer \t\t\t\t RS.180");
      System.out.println("4.Prawn and ginger dumplings\t\t\t RS.200");
      choice2=sc.nextInt();
      switch(choice2)
      {
        case 1:
          total+=120;
          order+="\nSoup \t\t RS.120";
          break;
        case 2:
          total+=140;
          order+="\nSalad \t\t RS.140";
          break;
        case 3:
          total+=160;
          order+="\nSpring rolls \t RS.160";
          break;
        case 4:
          total+=180;
          order+="\nChilli paneer \t RS.180";
          break;
        case 5:
          total += 200;
          order += "\nPrawn and ginger dumplings \t RS.200";
      }
    break;
    case 2:
      System.out.println("1.Pizza \t\t\t\t\t RS.120");
      System.out.println("2.Pasta \t\t\t\t\t RS.140");
      System.out.println("3.Burger \t\t\t\t\t RS.160");
      System.out.println("4.Chicken Biryani \t\t\t\t RS.180");
      System.out.println("5:Mutton Biryani \t\t\t\t RS.220");
      choice2=sc.nextInt();
      switch(choice2)
      {
      case 1:
        total+=120;
        order+="\nPizza \t RS.120";
        break;
      case 2:
        total+=140;
        order+="\nPasta \t RS.140";
        break;
      case 3:
        total+=160;
        order+="\n Burger \t RS.160";
        break;
      case 4:
        total+=180;
        order+="\nChicken BIryani \t RS.180";
        break;
      case 5:
        total += 220;
        order += "\nMutton Biryani \t RS.220";
        break;
      }
    break;
    case 3:
    System.out.println("1.Ice Cream \t\t\t RS.120");
    System.out.println("2.Cake \t\t\t\t RS.140");
    System.out.println("3.Puddling \t\t\t RS.160");
    System.out.println("4.Apple cake \t\t\t RS.180");
    choice2=sc.nextInt();
      switch(choice2)
      {
        case 1:
          total+=120;
          order+="\nIce Cream \t RS.120";
          break;
        case 2:
          total+=140;
          order+="\nCake \t RS.140";
          break;
        case 3:
          total+=160;
          order+="\nPuddling \t RS.160";
          break;
        case 4:
          total+=180;
          order+="\nApple cake \t RS.180";
          break;
      }
   break;
   case 4:
      System.out.println("1.Breezer \t\t\t RS.120");
      System.out.println("2.Orange juice \t\t\t RS.140");
      System.out.println("3.Lemonade \t\t\t RS.160");
      System.out.println("4.Coca cola \t\t\t RS.180");
      choice2=sc.nextInt();
      switch(choice2)
      {
      case 1:
        total+=120;
        order+="\n Breezer \t RS.120";
        break;
      case 2:
        total+=140;
        order+="\nOrange juice \t RS.140";
        break;
      case 3:
        total+=160;
        order+="\nLemonade \t RS.160";
        break;
      case 4:
        total+=180;
        order+="\nCoca cola \t RS.180";
        break;
      }
  break;
   default:
    System.out.println("Invalid choice");
    break;
   }
   System.out.println("Do you want to add any other Item YES/NO");
   ans=sc.next().charAt(0);
  }
  while(ans=='Y'||ans=='y');

  System.out.println();
  System.out.println("Thanks for coming :) \nVisit Again");
  System.out.println();
  System.out.println("*******Your Orders******\n"+order);
  System.out.println();
  System.out.println("Your total Bill amount is : "+total);
  System.out.println();
  System.out.println("Pay by Gpay or CASH");
 }
} 