// 有一個帳戶 , 帳戶中有存款餘額 , 您可以對帳戶進行存款與提款的動作 , 並可以查詢以取得存款餘額
public class Account {
    private double balance;
    private String id;

    // constructor
    public Account() {
        this(0,"123-4567");
        //this.balance = 0;
        //this.id = "123-4567";
    }

    // 設定 account 基本資訊
    public Account(double balance , String id) {
        this.balance = balance;
        this.id = id;
    }

    public String getAccountNumber() {
        return id;
    }
    
    public double getBalance() {
        return balance;
    }

    public double withdraw(double money) {
        if ( (balance - money) < 0) {
            System.out.println("There is no money");
            return 0;
        } 
        else {
            balance -= money;
            return money; 
        }
    }
    public void deopsit(double money) {
        balance += money;
    }
}