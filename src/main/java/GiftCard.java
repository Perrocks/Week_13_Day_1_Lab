public class GiftCard implements IChargable {
    private double giftCardBalance;

    public GiftCard(double giftCardBalance){
        this.giftCardBalance = giftCardBalance;
    }

    public double getGiftCardBalance(){
        return giftCardBalance;
    }
    public double chargeCard(double amountToCharge){
        return giftCardBalance -= amountToCharge;
    }

}
