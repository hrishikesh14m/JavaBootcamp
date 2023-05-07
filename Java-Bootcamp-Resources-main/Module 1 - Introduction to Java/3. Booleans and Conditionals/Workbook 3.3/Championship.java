public class Championship {
    public static void main(String[] args) {

        int gryffindor = 850;    //gryffindor points
        int ravenclaw = 100;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int gryffindorMargin=gryffindor-ravenclaw;



        //if gryffindor wins by a margin of 300 points:
             //print: Gryffindor takes the house cup!
        if(gryffindorMargin >= 300){
            System.out.println("Gryffindor takes the house cup!");
        } //if gryffindor wins by a margin of any points: 
        //print: In second place, Gryffindor!
        else if(gryffindorMargin >= 0){
            System.out.println("In second place, gryffindor");
        }   //if gryffindor loses by a margin of 100 points, they are third:
        //print: In third place, Gryffindor!
        else if(gryffindorMargin>= -100){
            System.out.println("In Third place, Gryffindor!");
        }else{
            System.out.println("In Fourth Place, Gryffindor!");
        }


       

     

        //else:
           //print: In fourth place, Gryffindor! 
        
    }
}