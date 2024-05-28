public class Bank {
    private int accountNumber;
    private int accoutBalance=0;
    private String customerName;
    private String emalil;
    private int phoneNumber;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccoutBalance() {
        return accoutBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmalil() {
        return emalil;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String withdrawBalance(int accoutBalance){
        if(accoutBalance < 0 || this.accoutBalance < accoutBalance){
            return "Insufficent Balance";
        }
        this.accoutBalance-=accoutBalance;
        return "Your Balance is Debited.New Balance Rs."+this.accoutBalance;
    }

    public String setAccountBalance(int accoutBalance){
        this.accoutBalance+=accoutBalance;
        return "Rs."+accoutBalance + " is credited.Your New Balance is Rs." +this.accoutBalance;
    }

}
