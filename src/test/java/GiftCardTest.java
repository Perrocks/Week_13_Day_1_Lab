import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {
    GiftCard giftCard;

    @Before
    public void before (){
        giftCard = new GiftCard(100.00);
    }

    @Test
    public void canGetGiftCardBalance(){
        assertEquals(100.00, giftCard.getGiftCardBalance(), 0.0);
    }

    @Test
    public void canChargeGiftCard(){
        assertEquals(75.00, giftCard.chargeCard(25.00), 0.0);
    }
}
