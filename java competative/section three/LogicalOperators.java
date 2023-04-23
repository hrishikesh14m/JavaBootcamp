public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade=67;
        int englishGrade=65;
        String language="java";

        if(chemistryGrade >75 || englishGrade > 75 || language.equals("java")){
            System.out.println("Congratulations, You got the scholarship!");
        }else{
            System.out.println("we're sorry, You didn't get the scolarship!" );
        }

        System.out.println();
        int credits=40;
       double GPA=1.4;

       if(credits >=40 && GPA>=2.0){
           System.out.println("You earned your diploma!");
       }else{
           System.out.println("Sorry, You need atleast 40 credits and a minimum GPA of 2.0");
       }


    }
}
