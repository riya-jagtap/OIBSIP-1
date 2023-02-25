import java.util.Scanner;
class Account{
    Scanner sc=new Scanner(System.in);
    String name;
    String date;
    String nationality;
    String verfiNum;
    int AccNumCnt=0;
    int AccID=1000;
    double balance;

 public void createAccount(){
     System.out.println("Enter Your Name: ");
     name=sc.nextLine();
     System.out.println("Enter date: ");
     date=sc.nextLine();
     System.out.println("Enter Nationality: ");
     nationality=sc.nextLine();
     System.out.println("Enter Aadhar/PAN/Verification number: ");
     verfiNum=sc.nextLine();

     do{
         System.out.println("Basic Balance: ");
         balance=sc.nextDouble();
         if(balance < 1000){
             System.out.println("Initial balance should be minimum Rs.1000!");
         }
         else{
             System.out.println("Account created");
         }
     }while(balance < 1000);
     AccNumCnt++;
     AccID=AccNumCnt;
 }

 void depositMoney(){
     double depAmt=0;
     System.out.println("Enter Amount that you want to deposit: ");
     depAmt=sc.nextDouble();
     balance=balance + depAmt;
     System.out.println("Your new balance is: "+balance);
 }

 void withdrawMoney(){
     double witAmt=0;
     do{
         System.out.println("Enter Amount that you want to withdraw: ");
         witAmt=sc.nextDouble();

         if(witAmt > balance){
             System.out.println("Account balance is less! Cannot withdraw...transaction failed! ");

         }
     }while(witAmt > balance);
     balance=balance-witAmt;
     System.out.println("Your current balance is: "+balance);
 }

 void checkBal(){
     System.out.println("Your current balance is: "+balance);
 }

 void displayAcc(){
     System.out.println("----Account Details----");
     System.out.println("Name: "+name);
     System.out.println("Account Number: "+AccID);
     System.out.println("Current balance: "+balance);
 }
}
public class BankSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account obj=new Account();

        int choice=0;
        System.out.println("WELCOME TO ABC BANK !");
        do{
            System.out.println("1.Create Account");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Check Balance");
            System.out.println("5.Display Account Info");
            System.out.println("6.Exit");
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    obj.createAccount();
                    break;

                case 2:
                    obj.depositMoney();
                    break;

                case 3:
                    obj.withdrawMoney();
                    break;

                case 4:
                    obj.checkBal();
                    break;

                case 5:
                    obj.displayAcc();
                    break;

                default:
                    if(choice!=6){
                        System.out.println("Invalid Input!");
                    }

            }
        }while (choice!=6);
    }
}
