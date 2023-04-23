import java.util.Scanner;

public class Dealership{

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership");
        
        System.out.println("\n .select option 'a' to buy a car ");
        System.out.println("\n .select option 'b' to sell a car ");
        String option=scan.nextLine();

        switch(option){
            case "a":System.out.println("What is your budget?");
            int budget=scan.nextInt();
            if(budget >= 10000){
                System.out.println("Great! A Nissan Altima is available");
                System.out.println("\nDo you have Insurence? write 'yes' or 'no' ");
                scan.nextLine();   
                String insurence=scan.nextLine();
                System.out.println("\nDo you have a drivers licence? write 'yes' or  'no'");
                String licence=scan.nextLine();
                System.out.println("\nWhat is your credit score?");
                int creditScore=scan.nextInt();

                    if(insurence.equals("yes")&& licence.equals("yes")&& creditScore >=660){
                        System.out.println("Sold!!Pleasure doing business with you");
                    }else{
                        System.out.println("We are Sorry. you are not eligible");
                    }            
                }else{
                System.out.println("We don't sell car under $10000.00.sorry!");
            }
            break;
            case "b" :
            System.out.println("\nwhat is your car valued at?");
            int value=scan.nextInt();
            System.out.println("\nwhat is your selling price?");
            int price= scan.nextInt();
            if(value > price && price< 30000){
                System.out.println("\nwe will buy your car. Pleasure doing business with you");
            }else{
                System.out.println("\nsorry,We are not interested!");
            }
            
            break;
            default : System.out.println("Invalid option");
        }
        scan.close();
    }
}