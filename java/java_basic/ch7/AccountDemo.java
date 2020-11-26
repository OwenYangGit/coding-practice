public class AccountDemo {
    public static void main(String[] args) {
        // 註冊一個帳戶
        Account myAccount = new Account(1000,"111-6666");
        // 取得帳戶 id
        System.out.println(myAccount.getAccountNumber());
        // 查看餘額
        System.out.println(myAccount.getBalance());
        // 提款
        myAccount.withdraw(330.25);
        // 查看提款後餘額
        System.out.println(myAccount.getBalance());
        // 存款
        myAccount.deopsit(150.95);
        // 查看存款後餘額
        System.out.println(myAccount.getBalance());
    }
}