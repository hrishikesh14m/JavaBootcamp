import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("What is your first name?");
        String fname=scan.nextLine();
        //Ask for their last name.
        System.out.println("\nWhat is your last name?");
        String lname=scan.nextLine();
        //Ask: how old are you?
        System.out.println("\nHow old are you?");
        int age=scan.nextInt();
        //Ask them to make a username.
        scan.nextLine();
        System.out.println("\nMake Username");
        String username=scan.nextLine();
        //Ask what city they live in.
        System.out.println("\nWhat city do you live in?");
        String city=scan.nextLine();
        //Ask what country that's from.
        System.out.println("\nWhat country is that?");
        String country=scan.nextLine();


        //Task 2 - Print their information. 
        System.out.println("\nYour Information");
        System.out.println("\tFirst Name: "+fname);
        System.out.println("\tLirst Name: "+lname);
        System.out.println("\tAge: "+age);
        System.out.println("\tusername: "+username);
        System.out.println("\tCity: "+city);
        System.out.println("\tCountry: "+country);

        System.out.println("Thank you for joining JavaGram!");

        scan.close();
        //Print their information like so:

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
    }
}