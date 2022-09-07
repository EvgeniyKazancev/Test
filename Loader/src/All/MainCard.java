package All;

import All.Card;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainCard {
    public static void main(String[] args) {


        Card card1 = new Card("peak", "6");
        Card card2 = new Card("peak", "7");
        Card card3 = new Card("peak", "8");
        Card card4 = new Card("peak", "9");
        Card card5 = new Card("peak", "10");
        Card card6 = new Card("peak", "J");
        Card card7 = new Card("peak", "Q");
        Card card8 = new Card("peak", "K");
        Card card9 = new Card("peak", "A");
        Card card10 = new Card("booby", "6");
        Card card11 = new Card("booby", "7");
        Card card12 = new Card("booby", "8");
        Card card13 = new Card("booby", "9");
        Card card14 = new Card("booby", "10");
        Card card15 = new Card("booby", "J");
        Card card16 = new Card("booby", "Q");
        Card card17 = new Card("booby", "K");
        Card card18 = new Card("booby", "A");
        Card card19 = new Card("cross", "6");
        Card card20 = new Card("cross", "7");
        Card card21 = new Card("cross", "8");
        Card card22 = new Card("cross", "9");
        Card card23 = new Card("cross", "10");
        Card card24 = new Card("cross", "J");
        Card card25 = new Card("cross", "Q");
        Card card26 = new Card("cross", "K");
        Card card27 = new Card("cross", "A");
        Card card28 = new Card("heart", "6");
        Card card29 = new Card("heart", "7");
        Card card30 = new Card("heart", "8");
        Card card31 = new Card("heart", "9");
        Card card32 = new Card("heart", "10");
        Card card33 = new Card("heart", "J");
        Card card34 = new Card("heart", "Q");
        Card card35 = new Card("heart", "K");
        Card card36 = new Card("heart", "A");
        Card card37 = new Card("booby", "K");
        Card card38 = new Card("peak", "A");
        List<Card> cardList = new ArrayList<>();

        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        cardList.add(card5);
        cardList.add(card6);
        cardList.add(card7);
        cardList.add(card8);
        cardList.add(card9);
        cardList.add(card10);
        cardList.add(card11);
        cardList.add(card12);
        cardList.add(card13);
        cardList.add(card14);
        cardList.add(card15);
        cardList.add(card16);
        cardList.add(card17);
        cardList.add(card18);
        cardList.add(card19);
        cardList.add(card20);
        cardList.add(card21);
        cardList.add(card22);
        cardList.add(card23);
        cardList.add(card24);
        cardList.add(card25);
        cardList.add(card26);
        cardList.add(card27);
        cardList.add(card28);
        cardList.add(card29);
        cardList.add(card30);
        cardList.add(card31);
        cardList.add(card32);
        cardList.add(card33);
        cardList.add(card34);
        cardList.add(card35);
        cardList.add(card36);
        cardList.add(card37);
        cardList.add(card38);

        Set<Card> cardSet = new HashSet<>(cardList);
      //  for (Card card : cardSet);
        System.out.print(cardSet);
    }
}
