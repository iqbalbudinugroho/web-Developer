public class Hand {
    private Card[] cardArray = new Card[5];
    private int numCards = 0;
public Hand(Card c1, Card c2){
    cardArray[0] = c1;
    cardArray[1] = c2;
    numCards = 2;
}
public void display() {
    for (int i = 0; i < numCards; i++) {
        System.out.println(cardArray[i]);

    }
}

public int getPoints() {
    int points = 0;
    boolean aceFound = false;

    for (int i = 0; i < numCards; i++) {
    points += cardArray[i].points;

    if(cardArray[i].name.equals("ace") && cardArray[i].points == 11) {
        aceFound = true;
    }
}
if (points > 21 && aceFound) {
    for(int i = 0; i < numCards; i++) {
        if(cardArray[i].name.equals("ace") && cardArray[i].points == 11) {
            cardArray[i].points = 1;
            points -= 10;
        }
    }
}
return points;
}
public Card deal() {
    if(numCards > 0) {
        Card dealtCard = cardArray[numCards - 1];
        cardArray[numCards - 1] = null;
        numCards--;
        return dealtCard;
    }
    return null;
}

public void hit(Card neCard){
    if (numCards < cardArray.length){
        cardArray[numCards] = neCard;
        numCards++;
    } else {
        System.out.println("Hand is full, cannot add more cards. ");
    }
}


}
