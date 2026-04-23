
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Hand implements Comparable<Hand> {

    private List<Card> list;

    public Hand() {
        this.list = new ArrayList<>();
    }

    public void add(Card card) {
        this.list.add(card);
    }

    public void sort() {
        Collections.sort(this.list);
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        for (Card card : this.list) {
            sb.append(card + "\n");
        }
        System.out.println(sb.toString());
    }
    
    public void sortBySuit() {
        BySuitInValueOrder sortBySuitInValOrder = new BySuitInValueOrder();
        Collections.sort(this.list, sortBySuitInValOrder);
    }

    @Override
    public int compareTo(Hand hand) {
        return this.list.stream()
                .map(x -> x.getValue())
                .reduce(0, (arg1, arg2) -> arg1 + arg2)
                - hand.list.stream()
                        .map(x -> x.getValue())
                        .reduce(0, (arg1, arg2) -> arg1 + arg2);
    }
}
