import java.util.Scanner;
//class to acess methods like deposit(),withdraw(),checkbalance()
class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: Rs."+amount);
        }
        else System.out.println("Invalid deposit amount");
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawn: Rs."+amount);
        }
        else{
            System.out.println("Insufficient amount or invalid amount");
        }
    }
    public void checkBalance(){
        System.out.println("Current balance: Rs."+balance);
    }
}
//Main class of ATM 
public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        BankAccount ac =new BankAccount(1000.0);//initial balance=1000.0

        System.out.println("ATM menu------>");

        System.out.println("1.Withdraw \n2.Deposit \n3.checkBalance\n4.Exit");

        while(true){
        System.out.print("Enter the choice: ");
        int choice=sc.nextInt();

        switch(choice){
            case 1 -> {
                System.out.print("Enter the amount you want to withdraw: ");
                double Withdraw=sc.nextDouble();
                ac.withdraw(Withdraw);
                }
            case 2 -> {
                System.out.print("Enter the amount you want to deposit: ");
                double Deposit=sc.nextDouble();
                ac.deposit(Deposit);
                }
            case 3 -> ac.checkBalance();
            
            case 4 -> System.exit(0);
        }
    }
}
}
