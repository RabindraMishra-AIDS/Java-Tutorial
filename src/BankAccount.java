import java.util.Scanner;

public class BankAccount {
    private int acc_number;
    private int acc_balance;

    public BankAccount(int acc,int bal){
        this.acc_number=acc;
        this.acc_balance=bal;
        System.out.println("Your Bank Account is Generated:"+ this.acc_number);
    }
    public void deposit(int addMoney){
        if(addMoney<=0){
            System.out.println("Invalid Deposit Amount");
        }
        else{
            this.acc_balance=this.acc_balance+addMoney;
            System.out.println("$" + addMoney +"deposited into your Account:"+ this.acc_number + ".");
        }
    }
    public void withdraw(int remove){
        if(remove>this.acc_balance){
            System.out.println("Not sufficient Bank Balance");
        }
        else{
            this.acc_balance=this.acc_balance-remove;
            System.out.println("$"+remove+" withdrawn from Account:"+ this.acc_number);
        }
    }
    public void check(){
        System.out.println("Balance is:"+this.acc_balance);
    }
    public static void main(String[] args){
        BankAccount bk=new BankAccount(4567,600);
        bk.check();
        bk.deposit(1000);
        bk.check();
        bk.withdraw(500);
        bk.check();

    }
}
