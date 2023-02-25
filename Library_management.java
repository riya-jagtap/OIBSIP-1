
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

class library1{
    String name;
    String password;
//    String book1;
    String book;
//    String book2;
    List<String>l=new ArrayList<>();

    public void login(){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
         name=sc.nextLine();
        System.out.println("Enter your Password: ");
         password=sc.nextLine();
    }
    public void book_keeping() {
        l.add("Ikigai");
        l.add("Sherlock Holmes");
        l.add("Think and Grow Rich");
        l.add("Harry Potter");
        l.add("Fire of Wings");
        l.add("Kargil");
        System.out.println(l);
        System.out.println("Add the books to Library ");
        Scanner sc2 = new Scanner(System.in);
        l.add(book=sc2.nextLine());
        System.out.println(l);
    }

    public void book_issue(){
        l.add("Ikigai");
        l.add("Sherlock Holmes");
        l.add("Think and Grow Rich");
        l.add("Harry Potter");
        l.add("Fire of Wings");
        l.add("Kargil");
        System.out.println(l);
        Scanner sc1=new Scanner(System.in);

        System.out.println("Which Book Do You Want?");
        book=sc1.nextLine();
        l.remove(book);
        System.out.println(l);
        System.out.println("The book has been issued");

    }

    public void book_return(){
        System.out.println("Which book you want to return?");
        Scanner s=new Scanner(System.in);
        book=s.nextLine();
        l.add(book);
        System.out.println("The Book has been returned");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Name:-  "+name);
        System.out.println("Title of book:- "+book);
        System.out.println("Date:- "+java.time.LocalDate.now());
        System.out.println("Status:- Returned");

    }
    public void receipt(){
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Name:- "+name);
        System.out.println("Title of Book:- "+book);
        System.out.println("Issue date:- "+java.time.LocalDate.now());
        System.out.println("Return date after 30 days of issued date ");
        System.out.println("Thank You!!! Visit Again!");
    }
}

public class Library_management {
    public static void main(String[] args) {
        library1 l1 = new library1();
        l1.login();

        System.out.println("1.Add Book 2.Book Issue 3.Book Return ");
        Scanner sc3 = new Scanner(System.in);
        int ch = sc3.nextInt();

        switch (ch) {
            case 1:
                l1.book_keeping();
                System.out.println("Book has been added!!");
                break;
            case 2:
                l1.book_issue();
                l1.receipt();
                break;
            case 3:
                l1.book_return();
                break;
            case 5:
                break;

        }
    }
}