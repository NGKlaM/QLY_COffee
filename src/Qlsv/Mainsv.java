package Qlsv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mainsv {

    public static void main(String[] args) {
        menu();
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        boolean check = true;
        List<SinhVien> danhSachSinhV = new ArrayList<>();
        while (check) {
            System.out.println("________Quản Lý Sinh Viên_________");
            System.out.println("1.Thêm sinh viên");

            System.out.println("2.Tìm kiếm sinh viên theo tên");
            System.out.println("3.Phân loại sinh viên theo sở thích");
            System.out.println("4.Tính % các sinh viên nữ, nam và theo sở thích của họ");
            System.out.println("5.Thực hiện sắp xếp sinh viên theo điểm trung bình");
            System.out.println("6.Exit");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so) {
                case 1:
                    themSinhVien(danhSachSinhV);
                    break;
                case 2:
                    timKiemTheoTen(danhSachSinhV);
                    break;
                case 3:
                    PhanLoaiSVTheoSoThich(danhSachSinhV);
                    break;
                case 4:
                    TinhPhanTramNamNuTheoSoThich(danhSachSinhV);
                    break;
                case 5:
                    sXsvtheodtb(danhSachSinhV);
                    break;
                case 6:
                    check = false;
                    System.out.println("Exit");
                    break;


            }

        }
    }

    private static void sXsvtheodtb(List<SinhVien> danhSachSinhV) {
        Collections.sort(danhSachSinhV, ((o1, o2) -> Float.compare((float) o2.getDiemTB(), (float) o1.getDiemTB())));
            for (int i = 0; i < danhSachSinhV.size(); i++) {
                danhSachSinhV.get(i).inThongTinSinhVien();
            }

    }


    private static void TinhPhanTramNamNuTheoSoThich(List<SinhVien> danhSachSinhV) {
        //Tính % các sinh viên nữ, nam và theo sở thích của họ
    }


    private static void PhanLoaiSVTheoSoThich(List<SinhVien> danhSachSinhV) {
        System.out.println("Nhập đúng sở thích để xem chi tiết:");
        String sott = scanner.nextLine();
        System.out.println("Sinh viên có sở thích bạn muốn tìm là:");
        for (int i = 0; i < danhSachSinhV.size(); i++) {
            if (danhSachSinhV.get(i).getSoThich().equals(sott)) {
                System.out.println(danhSachSinhV.get(i).getTenSV());
            } else {
                System.out.println("Không tồn tại người có sở thích này hoặc điền không đúng ");
            }
        }
    }

    private static void themSinhVien(List<SinhVien> danhSachSinhV) {
            System.out.println("Mời bạn nhập vào số lượng sinh viên:");
            int sl = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < sl; i++) {
                System.out.println("Mời bạn nhập tên sinh viên(6-20 kí tự) thứ:" + (i + 1));
                String ten = scanner.nextLine();
                if(ten.length()<=6 || ten.length()>=20){
                    System.out.println("Tên không được ít quá(6) hoặc nhiều quá(20)");
                    System.exit(0);
                }
                System.out.println("Mời bạn nhập tuổi sinh viên thứ " + (i + 1));
                int tuoii = Integer.parseInt(scanner.nextLine());
                System.out.println("Mời bạn nhập giới tính của sinh viên thứ:" + (i + 1));
                int gioitinhh = Integer.parseInt(scanner.nextLine());
                System.out.println("Mời bạn nhập sở thích của sinh viên thứ :" + (i + 1));
                System.out.println("Thể thao");
                System.out.println("Du lịch");
                System.out.println("Xem phim");
                System.out.println("Chơi game");
                String sothich = scanner.nextLine();
                System.out.println("Mời bạn mã sinh viên của sinh viên thứ " + (i + 1));
                String mas = scanner.nextLine();
                if(mas.length()!=8){
                    System.out.println("Mã sinh viên phải đủ 8 kí tự");
                }
                    System.out.println("Mời bạn nhập điểm của sinh viên thứ :" + (i + 1));
                    double diemtbbb = Double.parseDouble(scanner.nextLine());
               if (diemtbbb<0 || diemtbbb>10){
                   System.out.println("Điểm không thể âm hoặc lớn hơn 10");
               }else {
                   System.out.println("Mời bạn nhập điểm của sinh viên thứ :" + (i + 1));
                   double diemtbb = Double.parseDouble(scanner.nextLine());
               }
                danhSachSinhV.add(new SinhVien(ten, tuoii, gioitinhh, sothich, mas, diemtbbb));
            }
    }

    private static void timKiemTheoTen(List<SinhVien> danhSachSinhV) {
        System.out.println("Nhập tên sinh viên cần tìm:");
        String name1 = scanner.nextLine();
        System.out.println("Sinh viên bạn muốn tìm là:");
        for (int i = 0; i < danhSachSinhV.size(); i++) {
            if (danhSachSinhV.get(i).getTenSV().equals(name1)) {
                danhSachSinhV.get(i).inThongTinSinhVien();
            }
        }

    }

}
