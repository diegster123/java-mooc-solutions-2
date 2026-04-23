
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class BySuitInValueOrder implements Comparator<Card>{

    @Override
    public int compare(Card c1, Card c2) {
        if (c1.getSuit().ordinal() > c2.getSuit().ordinal()) {
            return 1;
        } else if (c1.getSuit().ordinal() == c2.getSuit().ordinal()) {
            return c1.compareTo(c2);
        } else {
            return -1;
        }
    }
    
}
