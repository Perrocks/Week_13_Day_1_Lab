import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    Wallet wallet;
    DebitCard debitCard;
//    CreditCard creditCard;

    @Before
    public void before(){
        wallet = new Wallet("Liam's Wallet");
//        debitCard = new DebitCard(1234, "90-80-70", 4321, "10/10/2025", 567);
    }

    @Test
    public void hasName(){
        assertEquals("Liam's Wallet", wallet.getName());
    }

    @Test
    public void cardListStartsEmpty(){
        assertEquals(0, wallet.cardCount());
    }

    @Test
    public void canAddCard(){
        wallet.addCardToWallet(debitCard);
        assertEquals(1, wallet.cardCount());
    }
}
