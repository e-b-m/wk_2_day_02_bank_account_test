import java.time.LocalDate;

public class BankAccount {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    String accountNumber;
    double balance = 0;

    public BankAccount(String firstName, String lastName, LocalDate dateOfBirth, String accountNumber, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public String getFirstName () {return this.firstName; }
    public void setFirstName(String newFirstName) { this.firstName = newFirstName;}

    public String getLastName () {return this.lastName;}
    public void setLastName(String newLastName) {this.lastName = newLastName;}

    public LocalDate getDateOfBirth() {return this.dateOfBirth;}
    public void setDateOfBirth (LocalDate newDate0fBirth) {this.dateOfBirth = newDate0fBirth;}

    public String getAccountNumber() {return this.accountNumber;}
    public void setAccountNumber(String newAccountNumber) {this.accountNumber = newAccountNumber;}

    public double getBalance(){return this.balance;}
    public void setBalance (double newBalance) {this.balance = newBalance;}

    public double deposit (int deposit) {
        this.balance = deposit + balance;
        return balance;
    }

    public double withdrawal (int withdrawal) {
        this.balance = balance - withdrawal;
        return balance;
    }

    public double payInterest (double rate) {
        double interestRate =  (rate/100);
        balance += (interestRate * balance);
        return balance;
    }





    // input (deposit)
    // return inputDesposit + balance = newBalance
    // System.out.println("You have this much in your account now : " + (newBalance));




 }


