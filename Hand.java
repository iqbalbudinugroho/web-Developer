public class Hand {
Card[] cardArray = new Card[5];
int numCards1 = 0;
Hand(Card c1, Card c2){
    cardArray[0] = c1;
    cardArray[1] = c2;
    numCards = 2;
}

public int numCards;
public void display() {
    for(int i = 0; i < numCards; i++)
    System.out.println();
}

public int getPoints() {
    int points = 0;
    for(int i = 0; i < numCards; i++){
        boolean aceFound = false;
        if(aceFound) {
            String a = "ace";
            if(a.equals(cardArray[i].name)&& cardArray[i].points == 11) {
                cardArray[i].points = 1;
                aceFound=true;
            }
        }
    }
    return points;
    
}
public Card deal() {
    return null;
}

public void hit(Card deal){
    
}


}
