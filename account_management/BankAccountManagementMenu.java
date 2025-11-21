package account_management;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BankAccountManagementMenu {
    private static BankAccountManagementMenu bankAccountMenu = null;
    public List<BankAccount> accounts;
    
    private BankAccountManagementMenu(){
        accounts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\database\\Data10.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                accounts.add(new BankAccount(parts[0], Long.parseLong(parts[1]), parts[2], parts[3], parts[4]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static BankAccountManagementMenu getInstance(){
        if(bankAccountMenu == null){
            bankAccountMenu = new BankAccountManagementMenu();
        }
        return bankAccountMenu;
    }
}
