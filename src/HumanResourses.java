import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class HumanResourses {
    public static void main(String[] args) {
        ArrayList<Staff> staffs = new ArrayList<Staff>();
        Scanner input = new Scanner(System.in);
        Manager m1 = new Manager("1", "Thanh", 28, 10000.0, "20/02/1997", "Kinh doanh", 1, "Business leader");
        staffs.add(m1);
        outer:
        do {
            System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty.");
            System.out.println("2. Hiển thị các bộ phận trong công ty.");
            System.out.println("3. Hiển thị các các nhân viên theo từng bộ phận.");
            System.out.println("4. Thêm nhân viên mới vào công ty.");
            System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên.");
            System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty.");
            System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.");
            System.out.println("0. Thoát chương trình.");
            System.out.print("Lựa chọn của bạn: ");
            int choice = input.nextInt();
            switch (choice) {
                case 0:
                    break outer;
                case 1:
                    // Do something
                    break outer;
                case 2:
                    System.out.println("The staff list: ");
                    for (Staff staff : staffs) {
                        staff.displayInformation();
                    }
                case 4:
                    do {
                        System.out.println("1. Thêm nhân viên thông thường\n2. Thêm nhân viên là cấp quản lý (có thêm chức vụ)");
                        /*String id, String name, int age, double salaryBase, String startingDate, String department, double leaveDays, String t*/
                        int inputInfoChoice = input.nextInt();
                        if (inputInfoChoice == 1) {
                            System.out.println("choi ins: inputInfoChoice " + inputInfoChoice);
                            System.out.println("Nhập mã NV: ");
                            String maNV = input.nextLine();
                            System.out.println("Nhập tên NV: ");
                            String tenNV = input.nextLine();
                            System.out.println("Nhập tuổi NV: ");
                            int tuoiNV = input.nextInt();
                            System.out.println("Nhập lương cơ bản NV: ");
                            double luongCbNV = input.nextDouble();
                            System.out.println("Nhập Phòng ban của NV: ");
                            String phongBanNV = input.nextLine();
                            System.out.println("Nhập ngày bắt đầu của NV: ");
                            String ngayBD = input.nextLine();
                            System.out.println("Nhập số ngày phép của NV: ");
                            double ngayPhep = input.nextDouble();
                            staffs.add(new Employee(maNV, tenNV, tuoiNV, luongCbNV, ngayBD, phongBanNV, ngayPhep));
                            break;
                        } else if (inputInfoChoice == 2) {
                            System.out.println("choi ins: inputInfoChoice " + inputInfoChoice);
                            System.out.println("Nhập mã NV: ");
                            String maNV = input.nextLine();
                            System.out.print("Nhập tên NV: ");
                            String tenNV = input.nextLine();
                            System.out.println("Nhập tuổi NV: ");
                            int tuoiNV = input.nextInt();
                            System.out.println("Nhập lương cơ bản NV: ");
                            double luongCbNV = input.nextDouble();
                            System.out.println("Nhập Phòng ban của NV: ");
                            String phongBanNV = input.nextLine();
                            System.out.println("Nhập ngày bắt đầu của NV: ");
                            String ngayBD = input.nextLine();
                            System.out.println("Nhập số ngày phép của NV: ");
                            double ngayPhep = input.nextDouble();
                            System.out.println("Nhập chức vụ của NV: ");
                            String chucVuNV = input.nextLine();
                            staffs.add(new Manager(maNV, tenNV, tuoiNV, luongCbNV, ngayBD, phongBanNV, ngayPhep, chucVuNV));
                            break;
                        } else {
                            System.out.println("Please input 1 or 2!");
                        }


                    } while (true);
                default:
                    break;
            }
        } while (true);
    }
    /*
        id, name, age, salaryBase, startingDate, department, leaveDays
    */
    /*Just a test*/
}
