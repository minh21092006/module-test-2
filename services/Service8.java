package services;
import java.util.Scanner;

import account_management.BankAccount;
import account_management.BankAccountManagementMenu;

public class Service8 {
    Scanner scanner = new Scanner(System.in);
    public void depositingCash(){
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
        System.out.println("Nhập số tiền muốn nạp:");
        long amount;
        try{
            amount = Long.parseLong(scanner.nextLine());
        } catch (Exception e){
            System.out.println("Số tiền không hợp lệ. Nạp tiền thất bại.");
            return;
        }
        if(amount <= 0){
            System.out.println("Số tiền nạp phải lớn hơn 0.");
            return;
        }
        long newBalance = account.getBalance() + amount;
        account.setBalance(newBalance);
        System.out.println("Nạp tiền thành công. Số dư tài khoản hiện tại: " + newBalance);
    }
}
