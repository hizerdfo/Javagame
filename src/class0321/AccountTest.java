package class0321;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    public void test() {
        Account account = new Account("홍길동",30000);
        assertEquals("홍길동", account.getOwner());
    }
    @Test
    public void transfer_테스트() {
        Account account = new Account("홍길동",30000);
        Account account2 = new Account("한석봉",0);
        
        account.transfer(account2, 10000);
        
        assertEquals(20000,account.getBalance());
        assertEquals(10000,account2.getBalance());
        
        Account account3 = new Account("한석봉(가짜)",0);
        account3.transfer(account, 10000);
        assertEquals(account,20000);
    }
    
}
