import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankTest {
    BankAccount bankAccount;

    @Test
    public void testDeposit() {
        int deposit = 100;
        int balance = 200;
        bankAccount = new BankAccount("Emma", "Bayley", LocalDate.of(1998,5,3), "1459873921" ,balance);
    bankAccount.deposit(deposit);
        assertThat(bankAccount.balance).isEqualTo(balance + deposit);
        System.out.println("Your balance is: " + (bankAccount.balance));}
    @Test
    public void testWithdrawal() {
        int balance = 600;
        int withdrawal = 200;
        bankAccount = new BankAccount("Emma", "Bayley", LocalDate.of(1998,5, 3), "1459873921", balance);
        bankAccount.withdrawal(withdrawal);
        assertThat(bankAccount.balance).isEqualTo(balance-withdrawal);
        System.out.println("Your new balance after withdrawal is: " + (bankAccount.balance));}
    @Test
    public void testPayInterest(){
        double balance = 700;
        double interestRate = 2.14;
        bankAccount = new BankAccount("Emma", "Bayley", LocalDate.of(1998,5,3), "1459873921" ,balance);
        bankAccount.payInterest(interestRate);
        assertThat(bankAccount.balance).isEqualTo(balance + ((interestRate/100) * balance));
        System.out.println("Your new bank balance after paying interest is: " + (bankAccount.balance));
    }

}

