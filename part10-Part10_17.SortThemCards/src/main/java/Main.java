
public class Main {

    public static void main(String[] args) {
        // test your code here

        Hand hand = new Hand();

        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sort();

        hand.print();

        Hand hand1 = new Hand();

        hand1.add(new Card(8, Suit.DIAMOND));
        hand1.add(new Card(11, Suit.SPADE));
        hand1.add(new Card(11, Suit.HEART));
        hand1.add(new Card(3, Suit.SPADE));

        Hand hand2 = new Hand();

        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));

        int comparison = hand1.compareTo(hand2);

        if (comparison < 0) {
            System.out.println("better hand is");
            hand2.print();
        } else if (comparison > 0) {
            System.out.println("better hand is");
            hand1.print();
        } else {
            System.out.println("hands are equal");
        }

        Hand hand3 = new Hand();

        hand3.add(new Card(12, Suit.HEART));
        hand3.add(new Card(4, Suit.SPADE));
        hand3.add(new Card(2, Suit.DIAMOND));
        hand3.add(new Card(14, Suit.SPADE));
        hand3.add(new Card(7, Suit.HEART));
        hand3.add(new Card(2, Suit.SPADE));

        hand3.sortBySuit();

        hand3.print();
    }
}
