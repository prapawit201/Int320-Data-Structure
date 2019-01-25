/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author INT320
 */
public class Deck {

    List<Card> deck;

    public Deck() {
        initial();
    }

    private void initial() {
        if (deck == null) {
            deck = new ArrayList(52);
        }
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public Card getCard(int index) {
        if (index >= deck.size()) {
            throw new RuntimeException("Card index out of bound exception : " + index);
        }
        return deck.get(index);
    }

    public void randomOrder() {
        Collections.shuffle(deck);
    }

    public List<Card> getCardsOnHand(int numberOfCard) {
        if (numberOfCard > deck.size()) {
            throw new RuntimeException("Card not enough for using exception : " + numberOfCard);
        }
        List<Card> tmp = deck.subList(deck.size() - numberOfCard - 1, deck.size() - 1);
        List<Card> onHand = new ArrayList(tmp);
        tmp.clear();
        return onHand;
    }

    public void sort() {
        Collections.sort(deck);
    }

    public List<Card> getCards() {
        return deck;
    }
}

