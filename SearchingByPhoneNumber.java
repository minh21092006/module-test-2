import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchingByPhoneNumber implements Searching {
    Scanner scanner = new Scanner(System.in);
    @Override
    public List<BankAccount> searchingAccount() {
        List<BankAccount> accounts = BankAccountManagementMenu.getInstance().accounts;
        List<BankAccount> foundAccounts = new ArrayList<>();
        System.out.println("Nhập số điện thoại cần tìm kiếm:");
        String phoneNumber = scanner.nextLine();
        for (BankAccount account : accounts) {
            if (account.getPhoneNumber().equals(phoneNumber)) {
                foundAccounts.add(account);
            }
        }
        return foundAccounts;
    }
}
