package services;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import account_management.BankAccount;
import account_management.BankAccountManagementMenu;

public class Service4 {
    Scanner scanner = new Scanner(System.in);
    public void addNewAccount(){
        List<BankAccount> accounts = BankAccountManagementMenu.getInstance().accounts;
        System.out.println("Vui lòng nhập thông tin tài khoản ngân hàng mới:");
        System.out.println("Họ và tên:");
        String name = scanner.nextLine();
        for(char c : name.toCharArray()){
            if(c != ' ' && !Character.isLetter(c)){
                System.out.println("Tên có chứa số hoặc kí tự đặc biệt. Tạo tài khoản thất bại.");
                return;
            }
        }
        System.out.println("Ngày sinh (dd-mm-yyyy):");
        String birthDate= scanner.nextLine();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate formattedDate = LocalDate.parse(birthDate, formatter);
            LocalDate currentDate = LocalDate.now();
            Period age = Period.between(formattedDate, currentDate);
            if(age.getYears()<0){
                System.out.println("Ngày sinh không hợp lệ. Tạo tài khoản thất bại.");
                return;
            }
            if(age.getYears()<18){
                System.out.println("Chủ tài khoản chưa đủ 18 tuổi để tạo tài khoản. Tạo tài khoản thất bại.");
                return;
            }
        } catch (DateTimeParseException e) {
            System.out.println("Định dạng ngày sinh không hợp lệ. Tạo tài khoản thất bại.");
            return;
        }
        System.out.println("Số dư ban đầu:");
        long balance;
        try {
            balance = Long.parseLong(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Số dư không hợp lệ. Tạo tài khoản thất bại.");
            return;
        }
        System.out.println("Số điện thoại:");
        String phoneNumber = scanner.nextLine();
        if(!phoneNumber.matches("^(03|05|07|08|09)\\d{8}$")){
            System.out.println("Số điện thoại không hợp lệ. Tạo tài khoản thất bại.");
            phoneNumber=scanner.nextLine();
        }
        System.out.println("Mật khẩu:");
        String password = scanner.nextLine();
        accounts.add(new BankAccount(name, balance, birthDate, phoneNumber, password));
        System.out.println("Tài khoản ngân hàng mới đã được tạo thành công.");
    }
}
