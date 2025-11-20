

public class BankAccount{
    private static int accountCounter = 0;
    private String name;
    private String accountId;
    private long balance;
    private String birthDate;
    private String phoneNumber;
    private String password;
    public BankAccount(String name, long balance, String birthDate, String phoneNumber, String password){
        accountCounter++;
        this.accountId = "0".repeat(6-String.valueOf(accountCounter).length())+ accountCounter;
        this.name = name;
        this.balance = balance;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public String getAccountId() {
        return accountId;
    }
    public long getBalance() {
        return balance;
    }
    public String getBirthDate() {
        return birthDate;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getPassword() {
        return password;
    }
    
    public void setBalance(long balance) {
        this.balance = balance;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Số tài khoản: "+accountId+", Họ và tên: "+name+", Ngày sinh: "+birthDate+", Số điện thoại: "+phoneNumber+", password: "+password+", Số dư: "+balance;
    }
}
