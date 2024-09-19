package anudipday2;
class  BankAccount{
    private Double accountNumber;
    private String accounHolder;
    private Double balance;

    public BankAccount(Double ano,String ah,Double b){
        this.accountNumber=ano;
        this.accounHolder=ah;
        this.balance=b;
    }
    public void deposit(Double amount){
        if(balance>0){
            balance+=amount;
        }
        else{
            System.out.println("please deposit correct amount ");
        }
    }

    public  void witdraw(Double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("successfully witdraw" + amount);
        }
        else if(amount>balance){
            System.out.println(" insufficient balance ");
        }
        else{
            System.out.println(" enter correct value ");
        }

    }
    public double get_balance(){
        return balance;
    }
    public String get_accHolder(){
        return accounHolder;
    }
    public Double get_accNo(){
        return accountNumber;
    }
}
public class BankMain {
    public static void main(String[] args) {
      BankAccount b=new BankAccount(10001.0,"mansi",30000.0);
        System.out.println(b.get_balance());
      b.witdraw(4000.0);
        System.out.println(b.get_accHolder());
        System.out.println(b.get_accNo());
        System.out.println(b.get_balance());
    }
}
