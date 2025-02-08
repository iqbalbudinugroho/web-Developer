import java.util.Scanner;;
public class Bermain {
    
    public static void main(String[] args) {
        int suitNumber = (int)(Math.random()*4.0+1);
        int faceNumber = (int)(Math.random()*13.0+1);
        Card newCard = new Card(suitNumber, faceNumber);
        System.out.println(newCard);

        suitNumber = (int)(Math.random()*4.0+1);
        faceNumber = (int)(Math.random()*13.0+1);
        System.out.println(newCard);

        int points = newCard.points+newCard.points;
        System.out.println("The total points +" + points);

        int numCards = 2;
        Scanner reader = new Scanner(System.in);
        int choice = 1;

        while(choice == 1 && points < 21 && numCards < 5) {
            System.out.println(" Do you want another card? ");
            System.out.println(" 1.Yes ");
            System.out.println(" 2.No ");
            choice=reader.nextInt();

            if(choice == 1) {
                numCards++;

                suitNumber = (int)(Math.random()*4.0+1);
                faceNumber = (int)(Math.random()*13.0+1);
                newCard = new Card(suitNumber, faceNumber);
                System.out.println(newCard);
            }
        }
    }
}
