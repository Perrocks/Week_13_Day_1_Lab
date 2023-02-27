public class CreditCard extends PaymentCard{
    private double availableCredit;

    public CreditCard(double availableCredit, int cardNumber, String expiryDate, int securityNumber){
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public double getAvailableCredit(){
        return availableCredit;
    }

    public double chargeCard(double amountToCharge){
        return availableCredit -= amountToCharge;
    }



}
