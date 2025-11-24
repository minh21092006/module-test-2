package com.project.services;
import java.util.Scanner;

import com.project.account_management.BankAccount;
import com.project.account_management.BankAccountManagementMenu;

public class Service9 {
    Scanner scanner = new Scanner(System.in);
    public void transferringCash(){
        System.out.println("Nhập số tài khoản ngân hàng người gửi:");
        String senderAccountId = scanner.nextLine();
        BankAccount senderAccount = null;
        for(BankAccount acc : BankAccountManagementMenu.getInstance().accounts){
            if(acc.getAccountId().equals(senderAccountId)){
                senderAccount = acc;
                break;
            }
        }
        if(senderAccount == null){
            System.out.println("Không tìm thấy tài khoản ngân hàng với số tài khoản người gửi đã nhập.");
            return;
        }
        System.out.println("Nhập số tài khoản ngân hàng người nhận:");
        String receiverAccountId = scanner.nextLine();
        BankAccount receiverAccount = null;
        for(BankAccount acc : BankAccountManagementMenu.getInstance().accounts){
            if(acc.getAccountId().equals(receiverAccountId)){
                receiverAccount = acc;
                break;
            }
        }
        if(receiverAccount == null){
            System.out.println("Không tìm thấy tài khoản ngân hàng với số tài khoản người nhận đã nhập.");
            return;
        }
        System.out.println("Nhập số tiền muốn chuyển:");
        long amount ;
        try {
            amount = Long.parseLong(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Số tiền không hợp lệ. Chuyển tiền thất bại.");
            return;
        }
        if(amount <= 0){
            System.out.println("Số tiền chuyển phải lớn hơn 0.");
            return;
        }
        if(amount > senderAccount.getBalance()){
            System.out.println("Số dư tài khoản người gửi không đủ để thực hiện giao dịch.");
            return;
        }
        long newSenderBalance = senderAccount.getBalance() - amount;
        long newReceiverBalance = receiverAccount.getBalance() + amount;
        senderAccount.setBalance(newSenderBalance);
        receiverAccount.setBalance(newReceiverBalance);
        System.out.println("Chuyển tiền thành công. Số dư tài khoản người gửi hiện tại: " + newSenderBalance);
    }
}
