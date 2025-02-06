
public class Deck {
Card[] cardArray = new Card[52];
int nextToDeal = 0;
Deck(){
    int suits = 4;
    int cardType = 13;
    int cardCount = 0;
    for (int i = 1;i<= suits; i++){
        for ( int j = 1;j <= cardType; j++){
            cardArray [cardCount] = new Card(i,j);
            cardCount++;
        } 
    }
    public void Print(){
        for (int i = 0; i < cardArray.length; i++)
        System.out.println(cardArray[i]);
    }
    public void shuffle() {
        int c1, int c2;
        Card temp;
        for(int i = 0; i < cardArray.length; i++){
            c1 = (int)(Math.random()*cardArray.length);
            c2 = (int)(Math.random()*cardArray.length);
            temp = cardArray[c1];
            cardArray[c2] = cardArray[c2];
            cardArray[c2] = temp;
        }
    }
public Card Deal() {
    nextToDeal++;
    return cardArray[nextToDeal - 1];
}
}
}

