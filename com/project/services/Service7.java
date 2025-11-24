package com.project.services;
import java.util.Scanner;

import com.project.account_management.BankAccount;
import com.project.account_management.BankAccountManagementMenu;

public class Service7 {
    Scanner scanner = new Scanner(System.in);
    public void withdrawCash(){
        System.out.println("Nhập số tài khoản ngân hàng:");
        String accountId = scanner.nextLine();
        BankAccount account = null;
        for(BankAccount acc : BankAccountManagementMenu.getInstance().accounts){
            if(acc.getAccountId().equals(accountId)){
                account = acc;
                break;
            }
        }
        if(account == null){
            System.out.println("Không tìm thấy tài khoản ngân hàng với số tài khoản đã nhập.");
            return;
        }
        System.out.println("Nhập số tiền muốn rút:");
        long amount;
        try {
            amount = Long.parseLong(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Số tiền không hợp lệ. Rút tiền thất bại.");
            return;
        }
        if(amount <= 0){
            System.out.println("Số tiền rút phải lớn hơn 0.");
            return;
        }
        if(amount > account.getBalance()){
            System.out.println("Số dư tài khoản không đủ để thực hiện giao dịch.");
            return;
        }
        long newBalance = account.getBalance() - amount;
        account.setBalance(newBalance);
        System.out.println("Rút tiền thành công. Số dư tài khoản hiện tại: " + newBalance);
    }
}
