import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Bank Bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        String customerName= scanner.nextLine();
        Bank.setCustomerName(customerName);
        System.out.println("Enter Customer Account Number");
        String accountNumber = scanner.nextLine();
        System.out.println(Bank.getCustomerName() + ",your balance is Rs."+ Bank.getAccoutBalance());
        System.out.println("Enter Amount to be Deposite");
        String depositeAmount = scanner.nextLine();
        System.out.println(Bank.setAccountBalance(Integer.parseInt(depositeAmount)));
        System.out.println("Enter Amount to withdraw");
        String withdrawAmount = scanner.nextLine();
        System.out.println(Bank.withdrawBalance(Integer.parseInt(withdrawAmount)));

    }
}
