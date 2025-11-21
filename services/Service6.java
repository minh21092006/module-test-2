package services;
import java.util.List;
import java.util.Scanner;

import account_management.BankAccount;
import account_management.BankAccountManagementMenu;

public class Service6 {
    Scanner scanner = new Scanner(System.in);
    public void changingPassword(){
        System.out.println("Nhập số tài khoản cần thay đổi password:");
        String id = scanner.nextLine();
        List<BankAccount> accounts = BankAccountManagementMenu.getInstance().accounts;
        BankAccount account = null;
        for(BankAccount acc : accounts){
            if(acc.getAccountId().equals(id)){
                account = acc;
                break;
            }
        }
        if(account != null){
            System.out.println("Tài khoản tìm thấy: " + account);
            System.out.print("Nhập mật khẩu mới: ");
            String newPassword = scanner.nextLine();
            account.setPassword(newPassword);
            System.out.println("Đã thay đổi mật khẩu thành công.");
        } else {
            System.out.println("Không tìm thấy tài khoản.");
        }
    }
}
