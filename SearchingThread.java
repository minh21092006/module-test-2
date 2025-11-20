import java.util.List;

public class SearchingThread implements Runnable{
    List<BankAccount> accounts = BankAccountManagementMenu.getInstance().accounts;
    String accountId;
    public SearchingThread(String accountId){
        this.accountId=accountId;
    }
    @Override
    public void run() {
        for(BankAccount account : accounts){
            if(account.getAccountId().equals(accountId)){
                System.out.println("Tài khoản ngân hàng được tìm thấy:\n"+account);
                return;
            }
        }
        System.out.println("Không tìm thấy tài khoản ngân hàng có số tài khoản :"+ accountId);
    }
}
