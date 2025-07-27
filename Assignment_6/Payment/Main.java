class PaymentDetails{
    private int  transaction_ID;
    private String payerName;
    private String  payeeName; 
    private double amount;
    private  String paymentMethod;
    private String transactionStatus;

   PaymentDetails(){
        transaction_ID = 0;
        payerName = null;
        payeeName = null;
        amount = 0.0;
        paymentMethod = null;
        transactionStatus = null;
   }

   public void setTransactionId(int transaction_ID){
        this.transaction_ID = transaction_ID;
   }

   public int getTransactionId(){
        return transaction_ID;
   }

   public void setPayerName(String payerName){
        this.payerName = payerName;
   }

   public String getPayerName(){
        return payerName;
   }

    public void setPayeeName(String payeeName){
        this.payeeName = payeeName;
   }

    public String getPayeeName(){
        return payeeName;
   }

   public void setAmount(double amount){
        this.amount = amount;
   }

    public double getAmount(){
        return amount;
   }


   public void setPaymentMethod(String paymentMethod){
        this.paymentMethod = paymentMethod;
   }

    public String getPaymentMethod(){
        return paymentMethod;
   }


   public void setTransactionStatus(String transactionStatus){
        this.transactionStatus = transactionStatus;
   }

    public String getTransactionStatus(){
        return transactionStatus;
   }

   public void display(){
        System.out.println(" transaction_ID: " +  transaction_ID);
        System.out.println(" payerName: " +  payerName);
        System.out.println(" payeeName: " +  payeeName);
        System.out.println(" amount: " +  amount);
        System.out.println(" paymentMethod: " +  paymentMethod);
        System.out.println(" transactionStatus: " +  transactionStatus);
   }

}



public class Main {
    public static void main(String[] args) {
        PaymentDetails details = new PaymentDetails();

        // Set values using setters
        details.setTransactionId(1001);
        details.setPayerName("Anandan");
        details.setPayeeName("Sridhar");
        details.setAmount(1500.75);
        details.setPaymentMethod("UPI");
        details.setTransactionStatus("SUCCESS");

        details.display();

        System.out.println(" Only Status: " + details.getTransactionStatus());
    }
}


