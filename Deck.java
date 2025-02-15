public class Deck {
    Card[] cardArray = new Card[52];
    private int nextToDeal = 0;

    public Deck(int Suits, int ranks){
        int Suit = 4;
        int cardType = 13;
        int cardCount = 0;
        for( int suit = 1; suit <= Suit; Suit++){
            for( int rank = 1; rank <= cardType; rank++){
                cardArray[cardCount] = new Card(suit, rank);
        }
    }

    public void Print(){
        for(int i = 0; i < cardArray.length; i++)
        System.out.println(cardArray[i]);
    }
    public void shuffle() {
        int c1, c2;
        Card temp;
        for(int i = 0; i < cardArray.length; i++){
            c1 = (int)(Math.random()*cardArray.length);
            c2 = (int)(Math.random()*cardArray.length);
            temp = cardArray[c2] = cardArray[c2];
            cardArray[c2] = temp;

        }
    }
    public Card deal(){
        if(nextToDeal < cardArray.length) {
            return cardArray[nextToDeal++];
        } else {
            System.out.println("No more Cards to deal. ");
            return null;
        }
    }
}
}