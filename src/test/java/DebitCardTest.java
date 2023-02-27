import org.junit.Before;
import org.junit.Test;

import javax.smartcardio.Card;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
    DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard(1234, "90-80-70", 4321, "10/10/2025", 567, 356.12);
    }

    @Test
    public void canGetAccountNumber(){
        assertEquals(1234, debitCard.getAccountNumber());
    }

    @Test
    public void canGetSortCode(){
        assertEquals("90-80-70", debitCard.getSortCode());
    }

    @Test
    public void canGetCardNumber(){
        assertEquals(4321, debitCard.getCardNumber());
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals("10/10/2025", debitCard.getExpiryDate());
    }

    @Test
    public void canGetSecurityNumber(){
        assertEquals(567, debitCard.getSecurityNumber());
    }

    @Test
    public void canGetDebitCardBalance() {
        assertEquals(356.12, debitCard.getDebitCardBalance(),0.0);
    }
    @Test
    public void canChargeDebitCard(){
        assertEquals(206.12, debitCard.chargeCard(150.00), 0.0);
    }


}
