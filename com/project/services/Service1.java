package com.project.services;
import java.io.FileWriter;
import java.util.Collections;
import java.util.List;

import com.project.account_management.BankAccount;
import com.project.account_management.BankAccountManagementMenu;
import com.project.comparator.IdComparator;

public class Service1 {
    public void sortByAccountNumber(){
        List<BankAccount> accounts = BankAccountManagementMenu.getInstance().accounts;
        Collections.sort(accounts, new IdComparator());
        try (FileWriter writer = new FileWriter("src\\com\\project\\Display.txt")) {
            writer.write("Danh sách tài khoản ngân hàng sắp xếp theo số tài khoản:\n");
            for(BankAccount account : accounts){
                writer.write(account+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
