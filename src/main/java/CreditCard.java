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
        double adjustedAmountToCharge = amountToCharge * 20 / 100 + amountToCharge;
        double newAvailableCredit = availableCredit -= adjustedAmountToCharge;
        String creditLogMessage = "Your total available credit is now" + " " + newAvailableCredit;
        System.out.println(creditLogMessage);
        return newAvailableCredit;
    }


}
