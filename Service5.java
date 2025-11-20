import java.util.List;
import java.util.Scanner;

public class Service5 {
    Scanner scanner = new Scanner(System.in);
    public void deletingAccount(){
        System.out.println("Nhập số tài khoản cần xóa:");
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
            System.out.println("Bạn có chắc chắn muốn xóa tài khoản này? Nhấn phím 'y' để xác nhận.");
            String confirmation = scanner.nextLine();
            if(confirmation.equals("y")){
                accounts.remove(account);
                System.out.println("Xóa tài khoản thành công: " + account);
            } else {
                System.out.println("Hủy xóa tài khoản.");
                return;
            }
        } else {
            System.out.println("Không tìm thấy tài khoản.");
        }
    }
}
