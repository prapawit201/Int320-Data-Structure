/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2Deck;

import java.util.List;

/**
 *
 * @author INT320
 */
public class TestDeck {

    public static void main(String[] args) {
        Deck d = new Deck();
        d.randomOrder();
        int pokcount = 0;
        for (int i = 1; i <= 10; i++) {
            List<Card> cardOnhands = d.getCardsOnHand(2);
            int value = cardOnhands.get(0).getValue() + cardOnhands.get(1).getValue();
            String pok = "";
            if (value % 10 == 8 || value % 10 == 9 ) {
                  
                  pok = " --> POK";
                  pokcount++;
            }
            System.out.println("{"+i+"}"+cardOnhands+pok);
        }
        System.out.println("--------------------");
        System.out.println(d.getCards());
        System.out.println();
        System.out.println("Pokcount : "+pokcount);
    }
}
