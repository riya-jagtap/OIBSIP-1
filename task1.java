import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Date;
import java.util.spi.AbstractResourceBundleProvider;

public class task1 {

    public static void main(String[] args) {

        HashMap<String,String>database= new HashMap<>();
        database.put("riya","12345");
        database.put("aditi","2345");
        database.put("sayali","4567");
        String Username;
        String Password;

        Scanner sc=new Scanner(System.in);

        System.out.println("------------Welcome to the Railway Reservation Service------------");
        System.out.println("Enter 1 for Login");
        System.out.println("Enter 2 for Registration");
        int a=sc.nextInt();

        if(a==1) {
            System.out.println("Enter Your UserName: ");
            Username = sc.next();
            System.out.println("Enter Your Password: ");
            Password = sc.next();

            if (database.containsKey(Username) && database.get(Username).equals(Password)){
                System.out.println("Login Successful");
            }
            else{
                System.out.println("Invalid UserName or Password");
                System.exit(0);
            }
        }
        else if (a==2){
            System.out.println("Enter Your Name: ");
            Username=sc.next();
            System.out.println("Enter Your Mobile number: ");
            int phoneNo =sc.nextInt();
            System.out.println("Create Password: ");
            Password=sc.next();

            if (database.containsKey(Username)){
                System.out.println("Username already exists! Try another");
            }
            else
            {
                database.put(Username,Password);
                System.out.println("Registration Completed Successfully!!");
            }
        }

        int price=100; 

        System.out.println("Enter 1 for Reservation");
        System.out.println("Enter 2 for Cancellation");
        int a1=sc.nextInt();
        if (a1==1) {
            System.out.println("Enter the number of Passengers");
            int no = sc.nextInt();
            for (int i = 0; i < no; i++) {
                System.out.println("Enter Name: ");
                String name = sc.next();
                System.out.println("Enter Age: ");
                int age = sc.nextInt();
                System.out.println("Enter Gender");
                String gender=sc.next();
            }
            System.out.println("Journey starts from: ");
            String from=sc.next();
            System.out.println("Destination: ");
            String dest=sc.next();
            System.out.println("Enter the Class Type(Enter 1. 1stAC,2. 2nd AC, 3.3rd AC, 4. General: ");
            int type=sc.nextInt();
            if (type==1){
                System.out.println("You have booked a 1st AC class");
                System.out.println("Total amount to pay: "+ no*5000);
            }
            else if (type==2){
                System.out.println("You have booked a 2nd AC class");
                System.out.println("Total amount to pay: "+ no*3000);
            }
            else if (type==3){
                System.out.println("You have booked a 3rd AC");
                System.out.println("Total amount to pay: "+ no*2000);
            }
            else if (type==4){
                System.out.println("You have booked a general class");
                System.out.println("Total amount to pay: "+ price*no);
            }
            System.out.println("Enter the Date of Journey: ");
            String date=sc.next();
            System.out.println("Enter the Train number");
            int b=sc.nextInt();


            switch (b){
                case 1:
                    System.out.println("Deccan express");
                    System.out.println("PNR - 123");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Journey Starts from:- "+ from);
                    System.out.println("Destination:- "+ dest);
                    System.out.println("Class Type: "+type);
                    System.out.println("Journey date:- "+date);
                    System.out.println("Train Number and Train Name:- "+b+" - Deccan Express");
                    System.out.println("Reservation Successful!!!\nHave a great journey ahead!\nThank You! ");
                    break;

                case 2:
                    System.out.println("Duranto Express");
                    System.out.println("PNR-234");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Journey Starts from:- "+ from);
                    System.out.println("Destination:- "+ dest);
                    System.out.println("Class Type: "+type);
                    System.out.println("Journey date:- "+date);
                    System.out.println("Train Number and Train Name:- "+b+" - Duranto Express");
                    System.out.println("Reservation Successful!!!\nHave a great journey ahead!\nThank You! ");
                    break;

                case 3:
                    System.out.println("Rajdhani Express");
                    System.out.println("PNR-345");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Journey Starts from:- "+ from);
                    System.out.println("Destination:- "+ dest);
                    System.out.println("Class Type: "+type);
                    System.out.println("Journey date:- "+date);
                    System.out.println("Train Number and Train Name:- "+b+" - Rajdhani Express");
                    System.out.println("Reservation Successful!!!\nHave a great journey ahead!\nThank You! ");
                    break;

                case 4:
                    System.out.println("Mumbai Express");
                    System.out.println("PNR-456");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Journey Starts from:- "+ from);
                    System.out.println("Destination:- "+ dest);
                    System.out.println("Class Type: "+type);
                    System.out.println("Journey date:- "+date);
                    System.out.println("Train Number and Train Name:- "+b+" - Mumbai Express");
                    System.out.println("Reservation Successful!!!\nHave a great journey ahead!\nThank You! ");
                    break;
            }


        }


        else if (a1==2){
            System.out.println("Enter the PNR number: ");
            int pnr=sc.nextInt();
            switch (pnr){
                case 123:
                         System.out.println("You had a booking of Deccan Express");
                         System.out.println("Are you sure you want to cancel?");
                         String confirm=sc.next();
                         if(confirm.equalsIgnoreCase("yes")){
                             System.out.println("Your Booking for Deccan Express is canceled!");
                         }
                         else if(confirm.equalsIgnoreCase("no")){
                             System.out.println("Your booking is still available and continued!");
                         }
                         break;

                case 234:
                    System.out.println("You had a booking of Duranto Express");
                    System.out.println("Are you sure you want to cancel?");
                    confirm=sc.next();
                    if(confirm.equalsIgnoreCase("yes")){
                        System.out.println("Your Booking for Duranto Express is canceled!");
                    }
                    else if(confirm.equalsIgnoreCase("no")){
                        System.out.println("Your booking is still available and continued!");
                    }
                    break;

                case 345:
                    System.out.println("You had a booking of Rajdhani Express");
                    System.out.println("Are you sure you want to cancel?");
                    confirm=sc.next();
                    if(confirm.equalsIgnoreCase("yes")){
                        System.out.println("Your Booking for Rajdhani Express is canceled!");
                    }
                    else if(confirm.equalsIgnoreCase("no")){
                        System.out.println("Your booking is still available and continued!");
                    }
                    break;

                case 456:
                    System.out.println("You had a booking of Mumbai Express");
                    System.out.println("Are you sure you want to cancel?");
                    confirm=sc.next();
                    if(confirm.equalsIgnoreCase("yes")){
                        System.out.println("Your Booking for Mumbai Express is canceled!");
                    }
                    else if(confirm.equalsIgnoreCase("no")){
                        System.out.println("Your booking is still available and continued!");
                    }
                    break;

            }

        }
    }
}
