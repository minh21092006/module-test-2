package com.project.searching;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.account_management.BankAccount;
import com.project.account_management.BankAccountManagementMenu;

public class SearchingById implements Searching {
    Scanner scanner = new Scanner(System.in);
    @Override
    public List<BankAccount> searchingAccount() {
        List<BankAccount> accounts = BankAccountManagementMenu.getInstance().accounts;
        List<BankAccount> foundAccounts = new ArrayList<>();
        System.out.println("Nhập số tài khoản cần tìm kiếm:");
        String id = scanner.nextLine();
        for (BankAccount account : accounts) {
            if (account.getAccountId().equals(id)) {
                foundAccounts.add(account);
                break;
            }
        }
        return foundAccounts;
    }
}
