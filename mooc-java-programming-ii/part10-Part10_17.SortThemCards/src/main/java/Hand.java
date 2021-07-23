import java.util.*;

public class Hand implements Comparable<Hand>{

    private List<Card> cards;

    public Hand(){
        this.cards=new ArrayList<>();
    }

    public void add(Card card){
        cards.add(card);
    }

    public void print(){

        Iterator<Card> cardIterator=cards.iterator();

        while (cardIterator.hasNext()){
            System.out.println(cardIterator.next());
        }

    }

    public void sort(){
        Collections.sort(cards, (c1, c2) ->c1.getSuit().compareTo(c2.getSuit()));
        Collections.sort(cards, (c1, c2) ->c1.getValue()-c2.getValue());
    }

    @Override
    public int compareTo(Hand o) {

        int sum1=cards.stream()
                .mapToInt(value -> value.getValue())
                .reduce(0, (previousValue, value) -> previousValue+value);

        int sum2=o.cards.stream()
                .mapToInt(value -> value.getValue())
                .reduce(0, (previousValue, value) -> previousValue+value);

        return sum1-sum2;
    }

    public void sortBySuit(){
        Collections.sort(cards, (c1, c2) -> {
            if (c1.getSuit().ordinal() == c2.getSuit().ordinal()){
                return c1.getValue()-c2.getValue();
            }
            return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        });

    }
}
