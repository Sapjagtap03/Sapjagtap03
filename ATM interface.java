//codsoft task 3 atm interface
//program written by Sapana Jagtap
import java.util.Scanner;
 class ATMmachine

{
    //main method start
    public static void main (String[] args) {
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);
        //declare and initialize balance, withdraw, and deposi
        int balance = 10000,deposit,withdraw;

        while(true){
            System.out.println("************************************************************");
            System.out.println("WELCOME TO THE ATM ");
            System.out.println("************************************************************");
            System.out.println("choose 1 for deposit:");
            System.out.println("choose 2 for withdraw:");
            System.out.println("choose 3 for balance inquiry:");
            System.out.println("choose 4 for exit:");
            System.out.println("choose correct operation to perform:");

             //get choice from user  
            int choice = sc.nextInt();

            switch (choice){

                case 1: 
                //get deposite amount from te user  
                System.out.println("Enter The Deposit Amount:");
                //get deposite amount from te user 
                deposit = sc.nextInt();
                //add the deposit amount to the total balanace
                balance = balance + deposit;
                 System.out.println("your Amount is succesfully deposited");
                System.out.println(" your updated balance is:"+balance);
                System.out.println();
                break;

                case 2:
                System.out.println("Enter The Withdrawal Amount:");
                withdraw = sc.nextInt();
                if(balance >= withdraw){

                //remove the withdrawl amount from the total balance  
                balance = balance - withdraw;
                System.out.println("Please collect your Amount");
                System.out.println("your updated balance i is:"+ balance);
                System.out.println();
                }else {
                    System.out.println("insufficient Amount");
                }
                

                System.out.println();
                break;

                case 3:
                 //displaying the total balance of the user  
                System.out.println("your account balance is:"+ balance);
                System.out.println("");
                break;

                case 4:
                //exit from the menu 
                System.out.println("Thanks for Visiting ATM System");
                System.exit(0);
            default:
            System.out.println("Invalid choce.Please choose a valid option");
            }
        }
        }
    }
