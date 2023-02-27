import org.junit.Before;
import org.junit.Test;

import javax.smartcardio.Card;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(500.00, 1234, "10/10/2025", 567);
    }

    @Test
    public void canGetAvailableCredit(){
        assertEquals(500.00, creditCard.getAvailableCredit(), 0.0);
    }

    @Test
    public void canGetCardNumber(){
        assertEquals(1234, creditCard.getCardNumber());
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals("10/10/2025", creditCard.getExpiryDate());
    }

    @Test
    public void canGetSecurityNumber(){
        assertEquals(567, creditCard.getSecurityNumber());
    }

    @Test
    public void canChargeCreditCard(){
        assertEquals(200, creditCard.chargeCard(250.00), 0.0);
    }
}
