package bank_app;
import java.util.Scanner;

import services.Service1;
import services.Service2;
import services.Service3;
import services.Service4;
import services.Service5;
import services.Service6;
import services.Service7;
import services.Service8;
import services.Service9;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        String s="----------------------------------------------\n"
                +"Chọn 1 trong các chức năng sau:\n"
                +"1. Hiển thị danh sách tài khoản ngân hàng sắp xếp theo số tài khoản.\n"
                +"2. Hiển thị danh sách tài khoản ngân hàng sắp xếp theo họ và tên.\n"
                +"3. Tìm kiếm tài khoản ngân hàng.\n"
                +"4. Tạo thêm tài khoản ngân hàng.\n"
                +"5. Xóa tài khoản ngân hàng.\n"
                +"6. Thay đổi password tài khoản ngân hàng.\n"
                +"7. Rút tiền khỏi tài khoản ngân hàng.\n"
                +"8. Nạp thêm tiền vào tài khoản ngân hàng.\n"
                +"9. Chuyển tiền.\n"
                +"Nhập 1 số (1-7) để chọn chức năng hoặc nhập kí tự khác để thoát.";
        System.out.println(s);
        String choice= scanner.nextLine();
        while(true){
            switch (choice){
                case "1":
                    Service1 service1=new Service1();
                    service1.sortByAccountNumber();
                    break;
                case "2":
                    Service2 service2=new Service2();
                    service2.sortByName();
                    break;
                case "3":
                    Service3 service3=new Service3();
                    service3.searchingAccount();
                    break;
                case "4":
                    Service4 service4=new Service4();
                    service4.addNewAccount();
                    break;
                case "5":
                    Service5 service5=new Service5();
                    service5.deletingAccount();
                    break;
                case "6":
                    Service6 service6=new Service6();
                    service6.changingPassword();
                    break;
                case "7":
                    Service7 service7=new Service7();
                    service7.withdrawCash();
                    break;
                case "8":
                    Service8 service8=new Service8();
                    service8.depositingCash();
                    break;
                case "9":   
                    Service9 service9=new Service9();
                    service9.transferringCash();
                    break;
                default:
                    System.out.println("Thoát chương trình.");
                    return;
            }
            System.out.println(s);
            choice= scanner.nextLine();
        }
    }
}
