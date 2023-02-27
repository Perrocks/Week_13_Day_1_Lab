public class DebitCard extends PaymentCard{

    private int accountNumber;
    private String sortCode;
    private double debitCardBalance;

    public DebitCard(int accountNumber, String sortCode, int cardNumber, String expiryDate, int securityNumber, double debitCardBalance){
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.debitCardBalance = debitCardBalance;

    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getSortCode(){
        return this.sortCode;
    }

    public double getDebitCardBalance() {
        return this.debitCardBalance;
    }

    public double chargeCard(double amountToCharge){
       double newBalance = debitCardBalance -= amountToCharge;
       String debitLogMessage = "Your new balance is" + " " + newBalance;
       System.out.println(debitLogMessage);
        return newBalance;
    }
}
