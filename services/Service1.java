package services;
import java.io.FileWriter;
import java.util.Collections;
import java.util.List;

import account_management.BankAccount;
import account_management.BankAccountManagementMenu;
import comparator.IdComparator;

public class Service1 {
    public void sortByAccountNumber(){
        List<BankAccount> accounts = BankAccountManagementMenu.getInstance().accounts;
        Collections.sort(accounts, new IdComparator());
        try (FileWriter writer = new FileWriter("src\\database\\Display.txt")) {
            writer.write("Danh sách tài khoản ngân hàng sắp xếp theo số tài khoản:\n");
            for(BankAccount account : accounts){
                writer.write(account+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
