public class CardGame {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};


    public void chooseCard () {
        for (int i=0;i<deck.length;i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Number of card: " + i);
            System.out.println("Type of card: " + suits[deck[i]/13]);
            System.out.println("Number of card: " + ranks[deck[i] % 13]);
        }
    }
}
