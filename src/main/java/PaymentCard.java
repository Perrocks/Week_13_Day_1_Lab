public abstract class PaymentCard implements IChargable{

    private int cardNumber;
    private String expiryDate;
    private int securityNumber;

    public PaymentCard(int cardNumber, String expiryDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

    public int getCardNumber(){
        return this.cardNumber;
    }
    public String getExpiryDate(){
        return this.expiryDate;
    }
    public int getSecurityNumber(){
        return this.securityNumber;
    }

    public String logTransaction(){
        return "Transaction Logged";
    }
}
