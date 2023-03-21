package class0321;

public class Account {
    
    public static void main(String[] args) {
        System.out.println("테스트시작");
        Account account = new Account("홍길동", 20000);
        System.out.println(account);
        
        Account account2 = new Account("한석봉",0);
        account.transfer(account2, Integer.MAX_VALUE + 1);
        
        if(account2.getBalance() == 214483647)
        System.out.println("========");
    }
    private String owner;
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    private int balance;
    
    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    //1원 ~ 1억까지
    //1,2, 99999999,,,1억
    //0,1,1원..실패
    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void transfer(Account dest, int amount) {
        dest.setBalance(dest.getBalance() + amount);
        balance -= amount;
    }
}
