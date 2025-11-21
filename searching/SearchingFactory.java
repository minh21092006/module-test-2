package searching;
import java.util.Scanner;

public class SearchingFactory {
    Scanner scanner=new Scanner(System.in);
    public Searching ReturnSearchingMethod(){
        System.out.println("Chọn phương thức tìm kiếm tài khoản:\n"
                +"1. Tìm kiếm theo số tài khoản.\n"
                +"2. Tìm kiếm theo tên tài khoản.\n"
                +"3. Tìm kiếm theo số điện thoại.");
        String choice=scanner.nextLine();
        switch (choice){
            case "1":
                return new SearchingById();
            case "2":
                return new SearchingByName();
            case "3":
                return new SearchingByPhoneNumber();
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                return ReturnSearchingMethod();
        }
    }
}
