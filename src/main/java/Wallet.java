import java.util.ArrayList;

public class Wallet {
        private String name;
        private ArrayList<IChargable> cards;

        public Wallet(String name){
            this.cards = new ArrayList<>();
            this.name = name;
        }

        public String getName(){
            return name;
        }

        public int cardCount(){
            return cards.size();
        }

        public void addCardToWallet(IChargable card){
            cards.add(card);
        }
}
