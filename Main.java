import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Deck deck = new Deck(0, 0);
        Hand dealer = new Hand(deck.deal(), deck.deal());
        Hand player = new Hand(deck.deal(),deck.deal());
        int playerPoints = 0,dealerPoints = 0;
        player.display();
        playerPoints=player.getPoints();
        System.out.println(" You have "+ playerPoints + "points");

        int choice = 1;
        while(choice == 1 && playerPoints < 21 && player.numCards <5){
            System.out.println(" Would you like another card? ");
            System.out.println(" 1.Yes ");
            System.out.println(" 2.No ");
            choice = reader.nextInt();
            if(choice == 1){
                player.hit(deck.deal());
                System.out.println(" her is your hand ");
                player.display();
                playerPoints = player.getPoints();
                System.out.println(" You have " + playerPoints + "points");
            }
        }
        dealerPoints = dealer.getPoints();
        while(dealerPoints < 16 && dealer.numCards < 5) {
            dealer.hit(deck.deal());
            dealerPoints=dealer.getPoints();
        }
        System.out.println(" Dealer has: ");
        dealer.display();
        System.out.println(" Dealer has " + dealerPoints + "poins.");
        
        if(playerPoints > 21)
            System.out.println(" Dealer has " + dealerPoints + "Points" );
        else if(dealerPoints>21)
            System.out.println(" Player busted.dealer wins. ");
        else if(dealerPoints>playerPoints)
            System.out.println(" Dealer wins. ");
        else if(dealerPoints==playerPoints)
            System.out.println("Dealer & Player tied ");
    }
}
